package api_collections.set._242;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Atun","Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};
        Set<String> duplicados = new HashSet<>();

        Set<String> unicos = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        //Método removeAll(duplicados) remueve de la lista que invoca las concurrencias que están en el argumento pasado
        unicos.removeAll(duplicados);

        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
