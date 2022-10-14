package uso_anotaciones._314;

import uso_anotaciones._314.models.Productos;
import uso_anotaciones._314.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Productos p = new Productos();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro ROBLE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
