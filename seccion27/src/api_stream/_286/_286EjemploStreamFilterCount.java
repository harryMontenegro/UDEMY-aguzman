package api_stream._286;


import api_stream._286.models.Usuarios;

import java.util.stream.Stream;

public class _286EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                //Operador terminal count() no recibe argumento y retorna un long con la cantidad de elementos del flujo
                .count();

        System.out.println(count);

    }
}
