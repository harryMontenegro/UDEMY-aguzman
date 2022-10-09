package api_stream._289;

import api_stream._287.models.Usuarios;

import java.util.stream.Stream;

public class _289EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuarios> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();// Distinct() para objetos se rige sobre el metodo equals


        nombres.forEach(System.out::println);

    }
}







