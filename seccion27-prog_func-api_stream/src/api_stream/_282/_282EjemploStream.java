package api_stream._282;

import java.util.ArrayList;
import java.util.List;

public class _282EjemploStream {
    public static void main(String[] args) {

        //Stream<String> nombres = Stream.of("Pato","Paco","Pepa","Pepe");
        //nombres.forEach(System.out::println);

//        String[] arr = {"Pato","Paco","Pepa","Pepe"};
//        Stream<String> nombres = Arrays.stream(arr);
//        nombres.forEach(System.out::println);

//        Stream<String> nombres = Stream.<String>builder().add("Pato")
//                .add("paco")
//                .add("Pepa")
//                .add("Pepe").build();
//        nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("paco");
        lista.add("Pepa");
        lista.add("Pepe");

//        Stream<String> nombres = lista.stream();
//        nombres.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
