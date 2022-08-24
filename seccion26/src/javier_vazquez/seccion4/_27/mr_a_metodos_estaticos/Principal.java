package javier_vazquez.seccion4._27.mr_a_metodos_estaticos;

import javier_vazquez.seccion4._27.mr_a_metodos_estaticos.modelos.Persona;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 18, "juanito@hotmail.com"),
                new Persona("Mario", 17, "mario@hotmail.com"),
                new Persona("Arturo", 17, "arturito@hotmail.com"),
                new Persona("Maria", 15, "maria@hotmail.com"),
                new Persona("Beatriz", 15, "bety@hotmail.com"),
                new Persona("Olivia", 12, "oli@hotmail.com"),
                new Persona("Angel", 25, "angelito@hotmail.com"),
                new Persona("Omar", 32, "omarcito@hotmail.com"),
                new Persona("Pamela", 28, "pamelita@hotmail.com"),
                new Persona("Sadee", 25, "sadecita@hotmail.com"),
                new Persona("Jared", 12, "jaredcito@hotmail.com"),
                new Persona("Sebastian", 14, "sebastiancito@hotmail.com"),
                new Persona("Javier", 18, "javiercito@hotmail.com"),
                new Persona("Roberto", 20, "robertico@hotmail.com"),
                new Persona("Oyuki", 22, "oyukita@hotmail.com"),
                new Persona("Linda", 25, "lindita@hotmail.com"),
                new Persona("Gustavo", 14, "tavito@hotmail.com"),
                new Persona("Lourdes", 15, "lulita@hotmail.com"),
                new Persona("Raquel", 16, "raquelota@hotmail.com")
        );

        System.out.println("personas sin ordenar: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println();

        //Collections.sort(personas, (persona1, persona2) -> Persona.compararPorEdad(persona1, persona2));
        Collections.sort(personas, Persona::compararPorEdad);//Método referenciado a un método estático
        System.out.println("personas ordenadas por edad: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println();
    }
}

























