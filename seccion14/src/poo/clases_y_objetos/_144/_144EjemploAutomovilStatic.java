package poo.clases_y_objetos._144;


public class _144EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
        nissan2.setColor("Amarillo");
        Automovil.setColorPatente("azul");

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automóvil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

    }
}











