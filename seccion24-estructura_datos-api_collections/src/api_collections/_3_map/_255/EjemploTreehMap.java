package api_collections._3_map._255;

import java.util.*;

//No forma parte de la interfaz Collection
public class EjemploTreehMap {
    public static void main(String[] args) {

        //Los TreeMap<> son ordenados, pero ordena de forma natural trabes de las llaves y no los valores
        //Map<String, Object> persona = new TreeMap<>((a,b)-> b.compareTo(a));
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        //persona.put(null, "1234");//Los TreeMap<> no permiten agregar null en la llave
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "jhon.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);
    }
}




