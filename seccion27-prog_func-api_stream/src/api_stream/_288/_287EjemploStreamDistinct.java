package api_stream._288;

import api_stream._287.models.Usuarios;

import java.util.Optional;
import java.util.stream.Stream;

public class _287EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        nombres.forEach(System.out::println);

    }
}







