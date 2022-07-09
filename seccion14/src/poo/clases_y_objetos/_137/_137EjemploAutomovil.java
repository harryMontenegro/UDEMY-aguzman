package poo.clases_y_objetos._137;

public class _137EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("kilómetros por litro " + subaru.calcularConsumo(300, 0.6F));

        System.out.println("kilómetros por litro " + subaru.calcularConsumo(300, 60));
    }
}