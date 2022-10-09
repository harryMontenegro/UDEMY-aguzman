package hilos_concurrencia._267.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

//Agendando tareas programadas que se repiten cada cierto periodo de tiempo usando timer.schedule(Timer, delay, period).
public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();//Para generar sonido del SO
        AtomicInteger contadorAtomic = new AtomicInteger(3);// Las vaiables atomicas sirven para implementarlas dentro de alguna implementación anónima
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { //Clase TimerTask implementa Runnable y permite crear una tarea programada
            //int contador = 3;//Sin la implementación de un contador la tarea se ejecutará indefinidamente por el intervalo de periodo indicado
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();// extrae el valor y lo decrementa de forma automática
                if (i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periódica en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());
                    //contador--;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
                //timer.cancel();// Se comenta el cancel porque una vez se ejecute la primera vez, cancelara el timer y no dejara que se repita la ejecución del argumento period
            }
        }, 0, 10000);// El tercer argumento period sirve para ejecutar cierto periodo de tiempo y si el hilo tarda más de ese tiempo se ajusta y no inicia el siguiente periodo hasta tanto no finalice.

        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos...");

    }
}








