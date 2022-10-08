package api_stream._294;

import api_stream._291.models.Usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        List<Usuarios> lista = new ArrayList<>();
        lista.add(new Usuarios("Andres", "Guzman"));
        lista.add(new Usuarios("Luci", "Martinez"));
        lista.add(new Usuarios("Pepe", "Fernandez"));
        lista.add(new Usuarios("Cata", "Perez"));
        lista.add(new Usuarios("Lalo", "Mena"));
        lista.add(new Usuarios("Exequiel", "Doe"));
        lista.add(new Usuarios("Bruce", "Lee"));
        lista.add(new Usuarios("Bruce", "Willis"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()//Soporta un pool de hilos para ejecutar de forma paralela cada elemento del flujo
                .map(u -> u.toString().toUpperCase())
                .peek(n -> System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n))
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("bruce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2-t1));
        System.out.println(resultado);
    }
}
