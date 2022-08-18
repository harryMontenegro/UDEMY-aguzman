package javier_vazquez.seccion3._16.ejercicio2;

import java.util.List;

public class EjercicioBiFunction3 {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = List.of(
                new Empleado("Javier", 2563.2),
                new Empleado("Arturo", 183.2),
                new Empleado("Carlos", 2648879.2),
                new Empleado("Jimena", 2546.2),
                new Empleado("Raul", 2522.2),
                new Empleado("Ramiro", 254.2),
                new Empleado("Saul", 23.2),
                new Empleado("Jaime", 25553.2),
                new Empleado("Flor", 2123543.2),
                new Empleado("Mirna", 321653.2)
        );

        Calculadora2 cal = new Calculadora2();
        List<Double> salarios = cal.cal((salario, incremento) -> salario + (salario * (incremento/100)), listaEmpleados, 16.0);

        for (Double sala : salarios) {
            System.out.println(sala);
        }
    }


}










