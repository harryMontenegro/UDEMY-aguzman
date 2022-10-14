package java8_Date_Time._307;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.now();
        // Las Zonas horarias están determinados por pais, se pueden consultar cada uno por google.
        //"America/New_York" = Region/Localizacion, palabras compuesta con _
        ZoneId newYork = ZoneId.of("America/New_York");
        //Tiempo con Zonas ZonedDateTime.of(fechaLocal, newYork) se le pasa la fecha local y el ZoneId
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Zona horaria de New York: " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //zonaNy.withZoneSameInstant(madrid) para determinar la diferencia horaria entre 2 zonas horarias, en este caso entre new york y madrid
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid);
        System.out.println("Zona horaria de madrid: " + zonaMadrid);
    }
}
