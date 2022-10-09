package javier_vazquez.seccion3._19;

import java.util.List;
import java.util.function.BiPredicate;

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = List.of(
                new Empleado("Rodrigo", 25, 1500, "Cobranzas"),
                new Empleado("Alicia", 25, 1500, "Ventas"),
                new Empleado("Manolo", 30, 1500, "Ventas"),
                new Empleado("Cinthia", 20, 2500, "Mostrador"),
                new Empleado("Esteban", 19, 7000, "Ventas"),
                new Empleado("Dámaris", 32, 600, "Telemarketing"),
                new Empleado("Lina", 36, 2500, "Mostrador"),
                new Empleado("Nayeli", 41, 10000, "Ventas"),
                new Empleado("Flor", 35, 7000, "Compras"),
                new Empleado("German", 20, 1500, "Facturación"),
                new Empleado("Lidia", 21, 600, "Telemarketing"),
                new Empleado("Eleazar", 33, 600, "Cobranzas"),
                new Empleado("Javier", 35, 600, "Cobranzas"),
                new Empleado("Paola", 50, 1500, "Compras"),
                new Empleado("Ignacio", 41, 1500, "Compras"),
                new Empleado("Rodrigo", 40, 7000, "Recursos Humanos"),
                new Empleado("Yolanda", 21, 1000, "Ventas"),
                new Empleado("Arturo", 54, 1500, "Cobranzas"),
                new Empleado("Olivia", 28, 563, "Mostrador"),
                new Empleado("Gerardo", 19, 5222, "Mostrador"),
                new Empleado("Richard", 34, 6500, "Mostrador"),
                new Empleado("Manuel", 40, 2000, "Facturación"),
                new Empleado("Jocabed", 21, 4666, "Mostrador"),
                new Empleado("Noe", 43, 1500, "Cobranzas"),
                new Empleado("Salvia", 33, 1500, "Cobranzas"),
                new Empleado("Pablo", 22, 1500, "Cobranzas"),
                new Empleado("Pedro", 55, 1500, "Compras"),
                new Empleado("Adamaris", 44, 10000, "Recursos Humanos")
        );

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Mostrador"));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        Evaluador evaluador = new Evaluador();
        System.out.println("Empleado de mostrador o ventas mayores de 25 años");
        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        for (Empleado empleado : listaActualizada) {
            System.out.println("Nombre: " + empleado.getNombre() + " " + " Edad: " + empleado.getEdad() + " " + " Departamento: " + empleado.getDepartamento());
        }
    }
}





























