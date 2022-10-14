package uso_anotaciones._311;

import uso_anotaciones._311.models.Productos;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Productos p = new Productos();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa centro roble");
        p.setPrecio(1000L);

        //Api reflection Field[] atributos = p.getClass().getDeclaredFields() se obtiene todos los atributos de la clase
        Field[] atributos = p.getClass().getDeclaredFields();

        String json = Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);//f.setAccessible(true); al ser atributos privados no son accesibles, por lo tanto se puede cambiar la visibilidad con setAccessible(boolean)
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("") ? f.getName() : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        return "\"" + nombre + "\":\"" + f.get(p) + "\"";//f.get(p) devuelve el valor del campo  del objeto
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al serializar a json: " + e.getMessage());
                    }
                }).reduce("{", (a, b) -> {
                    if("{".equals(a)) return a + b;

                    return a + ", " + b;
                }).concat("}");

        System.out.println("json = " + json);
    }
}
