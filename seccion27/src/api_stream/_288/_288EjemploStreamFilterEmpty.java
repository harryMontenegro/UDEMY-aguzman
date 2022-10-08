package api_stream._288;

import api_stream._288.models.Usuarios;

import java.util.Optional;
import java.util.stream.Stream;

public class _288EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        Long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);

    }
}







