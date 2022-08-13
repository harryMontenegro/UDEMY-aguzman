package hilos_concurrencia._261;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

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

        Thread main = Thread.currentThread();
        //Implementación funcional
        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());//Thread.currentThread() nos permite extraer información del hilo en ejecución o actual.
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };


        Thread v1 = new Thread(viaje, "Isla de pascua");
        Thread v2 = new Thread(viaje, "Robinson Crusoe");
        Thread v3 = new Thread(viaje, "Juan fernandez");
        Thread v4 = new Thread(viaje, "Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        //Thread.sleep(10000);
        //Con el método join(), es una espera a que todos los hilos finalicen en su proceso
        v1.join();
        v2.join();
        v3.join();
        v4.join();


        System.out.println("Continuando con la ejecución del método main: " + main.getName());
    }
}























