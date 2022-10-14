package uso_anotaciones._313;

import uso_anotaciones._313.models.Productos;
import uso_anotaciones._313.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Productos p = new Productos();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
