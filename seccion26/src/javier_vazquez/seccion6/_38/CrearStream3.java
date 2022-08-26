package javier_vazquez.seccion6._38;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream3 {
    public static void main(String[] args) {

        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);

        Stream<String> nombre = Arrays.stream(new String[]{"Juan","Pedro","Maria","Esteban"});
        nombre.forEach(System.out::println);

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");

        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Perez", 25, 25));
        estudiantes.add(new Estudiante("Mario", "Perez", 25, 12));
        estudiantes.add(new Estudiante("Ramiro", "Perez", 21, 255));
        estudiantes.add(new Estudiante("Esteban", "Perez", 28, 16));
        estudiantes.add(new Estudiante("Maria", "Perez", 27, 585));
        estudiantes.add(new Estudiante("Beatriz", "Perez", 26, 211));

        System.out.println("\nStream de estudiantes");
        Stream<Estudiante> estudiamntesStream = estudiantes.parallelStream();
        estudiamntesStream.forEach(estudiante -> System.out.println(estudiante.getNombre()));


    }
}







