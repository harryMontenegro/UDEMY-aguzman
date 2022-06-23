package clase_date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate77 {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        // Si se desea agregar un texto adicional, este debe ir en comillas simples ('')
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd' de 'MMMM, yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i < 100000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
