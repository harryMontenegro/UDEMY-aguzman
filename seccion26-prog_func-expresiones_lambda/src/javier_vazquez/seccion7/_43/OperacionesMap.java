package javier_vazquez.seccion7._43;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OperacionesMap {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int numero) {
                        return numero * numero;
                    }
                }).forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);

        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Promedio de ingresos de personal femenino mayor a 25");
        double suma = empleados.stream()
                .filter(Empleado::esMujer)
                .filter(emp -> emp.getEdad() > 25)
                .mapToDouble(Empleado::getIngresos)
                .sum();

        double promedio = suma / empleados.stream()
                .filter(Empleado::esMujer)
                .filter(emp -> emp.getEdad() > 25)
                .count();
        System.out.println("el promedio es: " + promedio);

    }
}





















