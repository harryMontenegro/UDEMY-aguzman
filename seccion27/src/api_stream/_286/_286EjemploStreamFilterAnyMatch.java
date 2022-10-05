package api_stream._286;


import api_stream._286.models.Usuarios;

import java.util.stream.Stream;

public class _286EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        Boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                //Operador terminal anyMatch() retorna un booleano que cunmpla con el argumento tipo predicate e interrumpe el flujo una vez encuentre la coincidencia
                // si existen 2 retornara true y cortara el flujo
                .anyMatch(u -> u.getId().equals(1));

        System.out.println(existe);

    }
}
