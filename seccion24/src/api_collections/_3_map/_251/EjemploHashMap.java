package api_collections._3_map._251;

import java.util.HashMap;
import java.util.Map;

//No forma parte de la interfaz Collection
public class EjemploHashMap {
    public static void main(String[] args) {

        //Utiliza el hashCode o el equal para determinar si un elemento es igual
        // Los Map no son ordenados, ni mantienen el orden de inserción.
        Map<String, String> persona = new HashMap<>();
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
    }
}
