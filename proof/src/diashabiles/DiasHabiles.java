package diashabiles;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiasHabiles {

    public static LocalDate sumarDiasHabiles(int diasSumar) {
        LocalDate fechaActual = LocalDate.now();
        int adicional = 1;
        while (adicional < diasSumar) {
            fechaActual = fechaActual.plusDays(1);
            if (fechaActual.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                --adicional;
                fechaActual = fechaActual.plusDays(1);
            } else {
                ++adicional;
            }
        }
        return fechaActual;
    }


    public int getDiasHabiles(LocalDate fechaInicial, LocalDate fechaFinal) {
        int diffDays = 0;
        //mientras la fecha inicial sea menor o igual que la fecha final se cuentan los dias
        while (fechaInicial.isBefore(fechaFinal) || fechaInicial.equals(fechaFinal)) {

            //si el dia de la semana de la fecha minima es diferente de sabado o domingo
            if (fechaInicial.getDayOfWeek().equals(DayOfWeek.SUNDAY) || fechaInicial.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                //se aumentan los dÃ­as de diferencia entre min y max
                diffDays++;
            }
            //se suma 1 dia para hacer la validaciÃ³n del siguiente dia.
            fechaInicial.plusDays(1);
        }
        return diffDays;
    }
}
