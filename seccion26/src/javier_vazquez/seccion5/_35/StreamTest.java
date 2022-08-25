package javier_vazquez.seccion5._35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Stream<Integer> numStream = numeros.stream();

        int suma = numStream
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("La suma de los números impares es: " + suma);
    }
}
