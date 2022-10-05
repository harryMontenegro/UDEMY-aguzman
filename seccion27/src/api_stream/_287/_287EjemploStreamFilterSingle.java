package api_stream._287;

import api_stream._287.models.Usuarios;

import java.util.Optional;
import java.util.stream.Stream;

public class _287EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuarios> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuarios(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println);


        //La clase Optional<T> ofrece una campa de abstracion a la hora de trabajar con valores null atravez de metodos de ayuda que evitan el NullPointerException
        Optional<Usuarios> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuarios("Jhon","Doe")).getNombre());
        //System.out.println(usuario.orElseGet(() -> new Usuarios("Jhon","Doe")));
        //System.out.println(usuario.orElseThrow(Supplier<>);

        //if(!usuario.isEmpty()){ // isEmpty() e isPresent() los dos devuelven un booleano, con la diferencia de que isEmpty() es la negación de isPresent()
        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontro el objeto!");
        }

    }
}







