package api_stream._289;


import api_stream._289.models.Usuarios;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _289EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()// Distinct() para objetos se rige sobre el metodo equals
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Total: " + stats.getSum());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Promedio: " + stats.getAverage());

    }
}







