package javier_vazquez.seccion7._42;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {

        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados hombres: ");
        empleados.stream()
                .filter(new Predicate<Empleado>() {
                    @Override
                    public boolean test(Empleado empleado) {
                        return empleado.esHombre();
                    }
                }).forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero()));

        System.out.println("\nEmpleados que son mujeres:");
        empleados.stream()
                .filter(Empleado::esMujer)
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero()));

        System.out.println("\nEmpleados mayores de 25");
        empleados.stream()
                .filter(emp -> emp.getEdad() > 25)
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));

        System.out.println("\nPersonal masculino cuya letra comience con la letra A");
        empleados.stream()
                .filter(Empleado::esHombre)
                .filter(emp -> emp.getNombre().startsWith("A"))
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));


        System.out.println("\nPersonal masculino que gana arriba de 500");
        empleados.stream()
                .filter(emp -> emp.esHombre() && emp.getIngresos() > 500)
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));

        System.out.println("\nPersonal femenino mayor de 25 años con ingresos por encima de los 300");

        Predicate<Empleado> empFemenino = Empleado::esMujer;
        Predicate<Empleado> empMayor25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> empMayor300 = emp -> emp.getIngresos() > 300;

        Predicate<Empleado> fem25300 = empFemenino.and(empMayor25).and(empMayor300);

        empleados.stream()
                .filter(fem25300)
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero() + " " + emp.getIngresos()));

        System.out.println("\nCantidad total: " + empleados.stream().filter(fem25300).count());

    }
}





















