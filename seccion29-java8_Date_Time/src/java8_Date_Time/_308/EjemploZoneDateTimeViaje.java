package java8_Date_Time._308;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploZoneDateTimeViaje {
    public static void main(String[] args) {

        //"2021/09/23 12:45" dara error al no ser un formato estandar, por lo tanto se puede manejar pasando como segundo argumento un DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        // Las Zonas horarias están determinados por pais, se pueden consultar cada uno por google.
        //"America/New_York" = Region/Localizacion, palabras compuesta con _
        ZoneId newYork = ZoneId.of("America/New_York");
        //Tiempo con Zonas ZonedDateTime.of(fechaLocal, newYork) se le pasa la fecha local y el ZoneId
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Horario de partida en New York: " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //zonaNy.withZoneSameInstant(madrid) para determinar la diferencia horaria entre 2 zonas horarias, en este caso entre new york y madrid
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalle del viaje a españa: ");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));
    }
}
