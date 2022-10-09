package hilos_concurrencia._259;

import hilos_concurrencia._259.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de pascua")).start();
        new Thread(new ViajeTarea("Robinson Crusoe")).start();
        new Thread(new ViajeTarea("Juan fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();

    }
}
