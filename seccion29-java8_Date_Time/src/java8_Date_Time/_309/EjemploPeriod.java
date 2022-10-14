package java8_Date_Time._309;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {

        //Al ser un Periodo, este va a ser operado entre fechas y no en tiempo, por lo tanto, va a ser un LocalDate y no LocalDateTime
        LocalDate fecha1 = LocalDate.of(2011, 9, 23);
        LocalDate fecha2 = LocalDate.of(2020, 11, 25);
        //fecha2.withMonth(12) para cambiar una porción de la fecha se puede usar los métodos with***(). Es inmutable por lo que se debe guardar.
        LocalDate fecha3 = fecha2.withMonth(12);
        fecha3 = fecha3.withDayOfMonth(28);


        Period periodo = Period.between(fecha1, fecha3);
        System.out.println("periodo = " + periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias", fecha1, fecha3, periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
