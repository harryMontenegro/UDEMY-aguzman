package uso_anotaciones._313.procesador;

import uso_anotaciones._313.JsonAtributo;
import uso_anotaciones._313.procesador.exception.JsonSerializadorExceptions;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class JsonSerializador {
    public static String convertirJson(Object o){

        if(Objects.isNull(o)) throw new JsonSerializadorExceptions("El objeto a serializar no puede ser null");

        Field[] atributos = o.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);//f.setAccessible(true); al ser atributos privados no son accesibles, por lo tanto se puede cambiar la visibilidad con setAccessible(boolean)
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("") ? f.getName() : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(o);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() && valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase() + nuevoValor.substring(1).toLowerCase();
                            f.set(o, nuevoValor);//f.set(o, nuevoValor) setea el nuevo valor al atributo
                        }
                        return "\"" + nombre + "\":\"" + f.get(o) + "\"";//f.get(o) devuelve el valor del campo  del objeto
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorExceptions("Error al serializar a json: " + e.getMessage());
                    }
                }).reduce("{", (a, b) -> {
                    if("{".equals(a)) return a + b;

                    return a + ", " + b;
                }).concat("}");
    }
}
