package hilos_concurrencia._260;

import hilos_concurrencia._260.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        //Clase anónima
        /*Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());//Thread.currentThread() nos permite extraer información del hilo en ejecución.
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            }
        };*/

        //Implementación funcional
        Runnable viaje = () -> {
                for(int i = 0; i< 10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());//Thread.currentThread() nos permite extraer información del hilo en ejecución o actual.
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            };

        new Thread(viaje, "Isla de pascua").start();
        new Thread(viaje, "Robinson Crusoe").start();
        new Thread(viaje, "Juan fernandez").start();
        new Thread(viaje, "Isla de Chiloe").start();
    }
}























