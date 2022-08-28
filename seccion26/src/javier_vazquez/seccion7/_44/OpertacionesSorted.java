package javier_vazquez.seccion7._44;

import java.util.Comparator;
import java.util.List;


public class OpertacionesSorted {
    public static void main(String[] args) {
        /*
        System.out.println("Nombre ordenados:");
        Stream.of("Alfredo", "Maria", "Daniel", "Brenda")
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNumeros ordenados");
        Stream.of(1,2,7,8,9,1,5,2,1,5,3,5)
                .sorted()
                .forEach(System.out::println);*/

        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Empleados ordenados por nombre: ");
        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));

        System.out.println("\nEmpleados ordenados por edad:");
        empleados.stream()
                .sorted(new Comparator<Empleado>() {
                    @Override
                    public int compare(Empleado o1, Empleado o2) {
                        return o1.getEdad().compareTo(o2.getEdad());
                    }
                })
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));

        System.out.println("\nEmpleados ordenados por salario:");
        empleados.stream()
                .filter(emp -> emp.getEdad() > 25)
                .sorted((emp1, emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos()))
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));
    }
}















