package api_stream._285;

import api_stream._285.models.Usuarios;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _285EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuarios> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);


        Optional<Usuarios> usuario = nombres.findFirst();
        System.out.println(usuario.get());
        //nombres.forEach(System.out::println);


    }
}
