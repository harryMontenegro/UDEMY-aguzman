package api_collections._3_map._252;

import java.util.*;

//No forma parte de la interfaz Collection
public class EjemploHashMap {
    public static void main(String[] args) {

        //Utiliza el hashCode o el equal para determinar si un elemento es igual
        // Los Map no son ordenados, ni mantienen el orden de inserción.
        Map<String, String> persona = new HashMap<>();
        System.out.println("contiene elemento: " + !persona.isEmpty());
        persona.put(null, "1234");// Acepta null en las llaves, pero solo 1
        persona.put(null, "12345");//Las llaves siempre son únicas y deja siempre la última ocurrencia
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        //persona.put("apellido", "Roe");//Las llaves siempre son únicas y deja siempre la última ocurrencia
        persona.put("email", "jhon.doe@email.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        String apellidoPaterno = persona.remove("apellidoPaterno");
        System.out.println("eliminado: " + apellidoPaterno);
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("eliminado: " + b);
        System.out.println("persona: " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("jhon.doe@email.com");
        System.out.println("b2 = " + b2);
        System.out.println("========================================");
        Collection<String> valores = persona.values();
        for (String v : valores){
            System.out.println("v = " + v);
        }
        System.out.println("======================================== keySet");
        //Método keySet() se obtiene los valores de las llaves
        Set<String> llaves = persona.keySet();
        for (String k : llaves){
            System.out.println("k = " + k);
        }
        System.out.println("======================================== entrySet");
        for (Map.Entry<String, String> par : persona.entrySet()) {
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("======================================== keySet");
        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("======================================== java8");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("contiene elemento: " + !persona.isEmpty());

        persona.replace("nombre", "Andrés");
        System.out.println("persona = " + persona);

        boolean b3 = persona.replace("nombre", "Jhon", "Andrés");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);
    }
}















