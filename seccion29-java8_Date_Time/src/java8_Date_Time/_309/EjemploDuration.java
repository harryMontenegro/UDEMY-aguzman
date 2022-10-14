package java8_Date_Time._309;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {

        //Periodo: Periodo de fechas en años, meses, dias
        //Duración: Periodo de tiempo de horas, minutos, segundos

        LocalDateTime fecha1 = LocalDateTime.now();
        //fecha1 = fecha1.withMonth(10);
        //LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20);
        //Al sumarse dias se mantiene el estandar en horas, es decir el periodo de tiempo se muestra en horas (lapsus = PT27H20M0.005S)
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

        //Duration: Para determinar el tiempo de duración entre 2 periodos de tiempo
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("lapsus = " + lapsus);
        //lapsus.getSeconds() obtiene el lapso en segundos
        System.out.println("lapsus segundos = " + lapsus.getSeconds());
        //Metodos lapsus.to***() convierte el lapsus segun corresponda su método
        System.out.println("lapsus en horas = " + lapsus.toHours());
        System.out.println("lapsus en minutos = " + lapsus.toMinutes());
        System.out.println("Sumamos 5 horas: " + lapsus.plusHours(5));

    }
}
