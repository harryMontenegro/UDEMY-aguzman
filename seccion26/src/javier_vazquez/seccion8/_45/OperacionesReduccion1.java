package javier_vazquez.seccion8._45;

import java.util.List;
import java.util.stream.IntStream;

public class OperacionesReduccion1 {
    public static void main(String[] args) {
        /*
        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        int suma = 0;
        for (int i = 0; i < numeros.length;i++){
            suma += numeros[i];
        }

        System.out.println("La suma es: " + suma);

        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        System.out.println("La cantidad de elementos: " + numeros.length);

        int minimo = numeros[0];
        for (int numero : numeros){
            if(numero < minimo){
                minimo = numero;
            }
        }
        System.out.println("El minimo es: " + minimo);

        System.out.println("\n");
        System.out.println("Operaciones de reduccion con empleados");
        List<Empleado> empleados = Empleado.empleados();

        double sumaSalarios = 0.0;
        for (Empleado empleado : empleados){
            sumaSalarios += empleado.getIngresos();
        }

        System.out.println("La suma de los salarios es: " + sumaSalarios);

        System.out.println("La cantidad de empleados es: " + empleados.size());

        Empleado empMaximo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if(empleado.getIngresos() > empMaximo.getIngresos()){
                empMaximo = empleado;
            }
        }

        System.out.println("El empleado con salario maximo es: " + empMaximo.getNombre() + " " + empMaximo.getIngresos());*/

        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};
        List<Empleado> empleados = Empleado.empleados();

        System.out.println("La suma es: " + IntStream.of(numeros).sum());

        System.out.println("El promedio es: " + IntStream.of(numeros).average().getAsDouble());

        System.out.println("El valor maximo es: " + IntStream.of(numeros).max().getAsInt());

        System.out.println("El valor minimo es: " + IntStream.of(numeros).min().getAsInt());

        System.out.println("Cantidad de elementos: " + IntStream.of(numeros).count());

        System.out.println("\nOperaciones con empleados y stream");
        System.out.println("suma de salarios: " + empleados.stream()
                .mapToDouble(Empleado::getIngresos)
                .sum());

        System.out.println("Obtener el empleado con el salario maximo");

        Empleado empMax = empleados.stream()
                .max((emp1, emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos())).get();

        System.out.println("empleado con el salario maximo: " + empMax.getNombre() + " " + empMax.getIngresos());
    }
}


















