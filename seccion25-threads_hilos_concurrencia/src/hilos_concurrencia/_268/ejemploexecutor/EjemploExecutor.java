package hilos_concurrencia._268.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        //Existen 2 interfaces importantes: Executor y ExecutorService,
        //Executor solo ejecuta una tarea con el método execute(Runnable).
        //ExecutorService además de ejecutar una tarea nos permite hacer un seguimiento con Callable.

        //Con la clase factory o de utilidad Executors podemos crear instancias con el new e invocar métodos estáticos.
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("nombre del Thread: " + Thread.currentThread().getName());
                //TimeUnit.SECONDS.sleep(Long) es una alternativa al Thread.sleep(), TimeUnit.SECONDS.sleep(Long) maneja la conversion de tiempo. Ejem: TimeUnit.SECONDS.sleep(Long) 0 TimeUnit.MINUTES.sleep(Long) etc.
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// Se usa para interrumpir la ejecución del hilo en caso de que se detenga el ExecutorService de forma abrupta.
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };

        //Con el método submit(tarea) se ejecuta la tarea
        executor.submit(tarea);
        executor.shutdown();// Si no se invoca shutdown() el executor.submit(tarea) continua ejecutándose aun asi haya terminado la tarea
        System.out.println("Continuando con al ejecución del método main 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);//Espera el tiempo pasado por argumento a que finalice todas las tareas y luego que se detenga el ExecutorService, continuara con el método main
        System.out.println("Continuando con al ejecución del método main 2");
    }
}














