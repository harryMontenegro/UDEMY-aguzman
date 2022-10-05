package api_stream._285;


import api_stream._285.models.Usuarios;

import java.util.stream.Stream;

public class _285EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuarios usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(5))
                .findFirst().get();


        System.out.println(usuario);

    }
}
