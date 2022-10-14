package java8_Date_Time._308;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTimeViajeOffSet {
    public static void main(String[] args) {

        //"2021/09/23 12:45" dara error al no ser un formato estandar, por lo tanto se puede manejar pasando como segundo argumento un DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        ZoneId newYork = ZoneId.of("America/New_York");
        //ZoneOffset.of("-04:00")) se puede pasar como segundo argumento con el formato UTC universal
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        //ZonedDateTime zonaNy = fechaLocal.atZone(newYork);
        ZonedDateTime zonaNy = fechaLocal.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Horario de partida en New York: " + zonaNy);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        //zonaNy.withZoneSameInstant(madrid) para determinar la diferencia horaria entre 2 zonas horarias, en este caso entre new york y madrid
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalle del viaje a españa: ");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));

        // ZoneId.getAvailableZoneIds() lista todos los ZoneId disponibles
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
