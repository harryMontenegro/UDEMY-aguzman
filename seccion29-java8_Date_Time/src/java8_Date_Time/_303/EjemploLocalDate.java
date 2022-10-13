package java8_Date_Time._303;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del Año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2020, 12, 25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeMañana = LocalDate.now().plusDays(1L);
        System.out.println("diaDeMañana = " + diaDeMañana);

        LocalDate mesAnterior = LocalDate.now().minusMonths(1L);
        System.out.println("mesAnterior = " + mesAnterior);

        mesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterior = " + mesAnterior);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int once = LocalDate.of(2020, 11,11).getDayOfMonth();
        System.out.println("once = " + once);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2020, 11,11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1L));
        System.out.println("esDespues = " + esDespues);
    }
}
