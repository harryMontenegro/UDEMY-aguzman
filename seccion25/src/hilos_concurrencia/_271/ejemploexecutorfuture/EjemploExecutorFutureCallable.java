package hilos_concurrencia._271.ejemploexecutorfuture;

import java.util.concurrent.*;

public class EjemploExecutorFutureCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        // Executors.newFixedThreadPool(2) devuelve un obj de tipo ThreadPoolExecutor, y este puede ser parametrizado de forma personalizada
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        /*executor.setCorePoolSize();
        executor.setKeepAliveTime();
        executor.setMaximumPoolSize();
        executor.setRejectedExecutionHandler();*/

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola :" + executor.getQueue().size());

        //Tipo de dato que captura un objeto de tipo Future<> de alguna tarea o hilo
        Callable<String> tarea = () -> {
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
            return "Algun resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () ->{
            System.out.println("Iniciando tarea 2");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        //Cuando se ejecuta una tarea con el submit(tarea), podría devolver un objeto del tipo Future<>, que es una representación de la tarea que se está realizando y permite realizar una trazabilidad de esta tarea.
        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola :" + executor.getQueue().size());


        executor.shutdown();
        System.out.println("Continuando con al ejecución del método main");

        //System.out.println(resultado.isDone());// devuelve un booleano

        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s",
                    resultado.isDone()? "finalizo" : "en proceso",
                    resultado2.isDone()? "finalizo" : "en proceso",
                    resultado3.isDone()? "finalizo" : "en proceso"));

            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("Obteniendo resultado1 de la tarea: " + resultado.get());// Se obtiene el resultado, pero bloquea el Thread actual hasta que finalice la tarea (tiene un delay de 3 segundos)
        System.out.println("Finaliza la tarea: " + resultado.isDone());

        System.out.println("Obteniendo resultado2 de la tarea: " + resultado2.get());
        System.out.println("Finaliza la tarea: " + resultado2.isDone());

        System.out.println("Obteniendo resultado3 de la tarea: " + resultado3.get());
        System.out.println("Finaliza la tarea: " + resultado3.isDone());
    }
}

























