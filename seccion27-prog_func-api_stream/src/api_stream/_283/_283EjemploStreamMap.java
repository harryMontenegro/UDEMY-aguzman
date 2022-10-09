package api_stream._283;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _283EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);


        //List<String> lista = nombres.collect(Collectors.toList());
        //lista.forEach(System.out::println);
        nombres.forEach(System.out::println);


    }
}
