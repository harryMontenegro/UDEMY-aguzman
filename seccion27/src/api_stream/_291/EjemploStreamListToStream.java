package api_stream._291;

import api_stream._291.models.Usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuarios> lista = new ArrayList<>();
        lista.add(new Usuarios("Andres", "Guzman"));
        lista.add(new Usuarios("Luci", "Martinez"));
        lista.add(new Usuarios("Pepe", "Fernandez"));
        lista.add(new Usuarios("Cata", "Perez"));
        lista.add(new Usuarios("Lalo", "Mena"));
        lista.add(new Usuarios("Exequiel", "Doe"));
        lista.add(new Usuarios("Bruce", "Lee"));
        lista.add(new Usuarios("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
    }
}
