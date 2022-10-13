package java8_Date_Time._304;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());

        LocalTime seisConTreinta = LocalTime.of(6, 30);
        System.out.println(seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30");// Hora formato 24 horas
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        boolean esAnterior = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);
    }
}
