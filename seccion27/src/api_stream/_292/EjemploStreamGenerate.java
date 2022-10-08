package api_stream._292;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamGenerate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> { //Stream.generate() genera un stream infinito y se le puede dar un limite
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //return "Hola Mundo!";
            return contador.incrementAndGet();
        }).limit(7).forEach(System.out::println);
    }
}
