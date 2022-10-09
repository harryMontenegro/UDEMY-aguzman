package hilos_concurrencia._271.ejemploexecutorfuture;

import hilos_concurrencia._271.ejemploexecutorfuture.ejemplosync.Panaderia;
import hilos_concurrencia._271.ejemploexecutorfuture.runnable.Consumidor;
import hilos_concurrencia._271.ejemploexecutorfuture.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductoConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        // Executors.newFixedThreadPool(2) devuelve un obj de tipo ThreadPoolExecutor, y este puede ser parametrizado de forma personalizada
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);


        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola :" + executor.getQueue().size());


        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro2 = executor.submit(consumidor);
        Future<?> futuro1 = executor.submit(productor);


        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola :" + executor.getQueue().size());


        executor.shutdown();
        System.out.println("Continuando con al ejecución del método main");

    }
}

























