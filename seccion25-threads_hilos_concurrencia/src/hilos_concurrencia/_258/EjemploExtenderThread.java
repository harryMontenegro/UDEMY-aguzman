package hilos_concurrencia._258;

import hilos_concurrencia._258.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        //Al crear la instancia de un hilo por defecto su estado inicial es NEW, este hilo en este instante aún no se ha ejecutado. Con getState() podemos verificar el estado de un hilo.
        Thread hilo = new NombreThread("Jhon Doe");

        //Al Ejecutar el hijo pasa a un estado de NEW a RUNNABLE
        hilo.start();

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        //Con Thread.sleep(100) se hace una pausa del hilo en curso, es decir el método main
        //Thread.sleep(3);

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();

        System.out.println(hilo.getState());

    }
}
