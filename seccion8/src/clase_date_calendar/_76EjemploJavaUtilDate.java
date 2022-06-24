package clase_date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _76EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        // Si se desea agregar un texto adicional, este debe ir en comillas simples ('')
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd' de 'MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
