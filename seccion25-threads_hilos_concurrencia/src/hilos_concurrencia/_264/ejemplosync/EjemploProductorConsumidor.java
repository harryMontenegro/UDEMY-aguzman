package hilos_concurrencia._264.ejemplosync;

import hilos_concurrencia._264.runnable.Consumidor;
import hilos_concurrencia._264.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
