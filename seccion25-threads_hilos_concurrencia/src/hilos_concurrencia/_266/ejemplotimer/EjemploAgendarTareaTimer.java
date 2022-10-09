package hilos_concurrencia._266.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        //La clase timer nos permite programar tareas para ser ejecutadas en un tiempo definido
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { //Clase TimerTask implementa Runnable y permite crear una tarea programada
            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + new Date() +  " nombre del Thread: " + Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                timer.cancel();// Se cancela el Timer
            }
        }, 5000);

        System.out.println("Agendamos una tarea para 5 segundos más...");

    }
}








