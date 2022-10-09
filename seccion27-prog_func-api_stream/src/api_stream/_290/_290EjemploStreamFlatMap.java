package api_stream._290;

import api_stream._290.models.Usuarios;

import java.util.stream.Stream;

public class _290EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuarios> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                //flatMap es parecido al map, retorna otro flujo de stream diferente, y retorna varias salidas
                .flatMap(u -> {
                    if(u.getNombre().equals("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();// Se retorna un Stream vacio
                })
                .peek(System.out::println);


        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
