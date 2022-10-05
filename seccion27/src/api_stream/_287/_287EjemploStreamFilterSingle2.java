package api_stream._287;


import api_stream._286.models.Usuarios;

import java.util.stream.Stream;

public class _287EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuarios usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(4))
                //El operador terminal findFirst() es un operador final de corto que cierra el flujo una vez encuentra la coincidencia
                .findFirst().orElseGet(() -> new Usuarios("Jhon","Doe"));

        System.out.println(usuario);

    }
}
