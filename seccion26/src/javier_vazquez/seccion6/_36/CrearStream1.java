package javier_vazquez.seccion6._36;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream1 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("curso de programación");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("curso1","curso2","curso3","curso4");
        stream2.forEach(System.out::println);

        String[] arreglo = {"Java", "C++", "C#", "Ruby"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);

        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
                .add(new Estudiante("n01",17,1.70,9.5))
                .add(new Estudiante("n02",21,1.70,9.5))
                .build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

        IntStream unoAVeinte = IntStream.range(1, 21); // de 1 a 20 el 21 es exclusive
        IntStream unoAVeinteInclu = IntStream.rangeClosed(1, 20); // con rangeClosed() el 20 es inclusivo
        unoAVeinte.forEach(System.out::println);
        unoAVeinteInclu.forEach(System.out::println);


    }
}








