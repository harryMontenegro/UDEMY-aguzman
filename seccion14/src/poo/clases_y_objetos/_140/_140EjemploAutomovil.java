package poo.clases_y_objetos._140;

import java.util.Date;

public class _140EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("kilómetros por litro " + subaru.calcularConsumo(300, 0.6F));

        System.out.println("kilómetros por litro " + subaru.calcularConsumo(300, 60));
        System.out.println("kilómetros por litro " + nissan.calcularConsumo(300, 60));
    }
}











