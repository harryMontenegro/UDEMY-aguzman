package api_stream._284;

import api_stream._284.models.Usuarios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _284EjemploStreamMap {
    public static void main(String[] args) {

        Stream<Usuarios> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuarios -> {
                    String nombre =  usuarios.getNombre().toUpperCase();
                    usuarios.setNombre(nombre);
                    return usuarios;
                });


        List<Usuarios> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);


    }
}
