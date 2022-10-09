package javier_vazquez.seccion3._15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DatosComesales {
    public static void main(String[] args) {

        List<Comensal> listaComensales = List.of(
                new Comensal("Javier", 10, 5),
                new Comensal("Javier", 10, 5),
                new Comensal("Arturo", 10, 5),
                new Comensal("Mario", 10, 5),
                new Comensal("Aguila", 10, 5),
                new Comensal("Lo que sea", 10, 5),
                new Comensal("Cambio", 10, 5)
        );

        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());

        System.out.println("La lista de nombre de comensales es la siguiente: ");
        for (Object nombreComensal : nombresComensales){
            System.out.println("El nombre es: " + nombreComensal);
        }

        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMonto_pedido());
        for (Object montos : montosComensales){
            System.out.println("El monto es: " + montos);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func) {

        List<Object> listaDatos = new ArrayList<>();
        for (Comensal comensal : listaCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;

    }
}
