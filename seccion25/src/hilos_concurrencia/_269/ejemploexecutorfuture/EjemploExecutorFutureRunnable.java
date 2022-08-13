package hilos_concurrencia._269.ejemploexecutorfuture;

import java.util.concurrent.*;

public class EjemploExecutorFutureRunnable {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

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
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// Se usa para interrumpir la ejecución del hilo en caso de que se detenga el ExecutorService de forma abrupta.
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };

        //Cuando se ejecuta una tarea con el submit(tarea), podría devolver un objeto del tipo Future<>, que es una representación de la tarea que se está realizando y permite realizar una trazabilidad de esta tarea.
        //Como el argumento pasado al submit es de tipo Runnable, este no devuelve nada, por lo tanto, en el genérico se le pasa signo de interrogación (?), si es Callable retornaría un valor
        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();// Si no se invoca shutdown() el executor.submit(tarea) continua ejecutándose aun asi haya terminado la tarea
        System.out.println("Continuando con al ejecución del método main");

        //System.out.println(resultado.isDone());// devuelve un booleano

        while (!resultado.isDone()){
            System.out.println("ejecutando tarea...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));// Se obtiene el resultado, pero bloquea el Thread actual hasta que finalice la tarea (tiene un delay de 3 segundos)
        System.out.println("Finaliza la tarea: " + resultado.isDone());
    }
}




