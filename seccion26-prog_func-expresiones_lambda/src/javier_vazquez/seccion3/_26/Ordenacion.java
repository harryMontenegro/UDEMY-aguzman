package javier_vazquez.seccion3._26;

import java.util.*;

public class Ordenacion {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList(
                "Carlos",
                "Ana",
                "Abías",
                "German"
        );

        System.out.println("Lista antes de ordenarse: " + nombres);
        Collections.sort(nombres);
        System.out.println("Lista después de ordenarse: " + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Mario"));
        personas.add(new Persona(2,"Fernando"));
        personas.add(new Persona(3,"Omar"));
        personas.add(new Persona(4,"Juana"));

        System.out.println("Lista de personas sin ordenar: " + personas);
        Collections.sort(personas);
        System.out.println("Lista de personas ordenadas por nombre: " + personas);

        //Collections.sort(personas, new OrdenarPersonasPorId());
        /*Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getIdPersona() - o2.getIdPersona();
            }
        });*/
        Collections.sort(personas, (p1, p2) -> p1.getIdPersona() - p2.getIdPersona());
        System.out.println("Lista de personas ordenadas por id: " + personas);

    }
}

