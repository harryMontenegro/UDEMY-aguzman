package clase_date_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar78 {
    public static void main(String[] args) {

        //Calendar es una clase abstracta
        //getInstance() es un método estático que realiza el new
        Calendar calendario = Calendar.getInstance();

        //Los meses en Calendar inician en 0 para enero, 1 para febrero asi sucesivamente hasta diciembre que sería el mes 11
        //1era Forma
        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);

        //2da Forma
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        // Hora de formato 24
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        //Hora formato 12 horas
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        //"yyyy-MM-dd HH:mm:ss:SSS" : los milisegundos se representan con las tres ultimas s (SSS) del formato
        //Formato 24 horas
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //Formato 12 horas
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);














    }
}
