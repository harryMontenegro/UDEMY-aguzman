package java8_Date_Time._309;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {
    public static void main(String[] args) {

        //Instante de tiempo, una alternativa a Duration
        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();

        Duration tiempo = Duration.between(i1, i2);
        System.out.println("tiempo = " + tiempo);

    }
}
