package api_stream._288;

import java.util.stream.Stream;

public class _287EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5, 10, 15, 20);

        //reduce() operador de reduccion, entre los elemntos del del stream y retorna un solo resultado del mismo tipo, sirve como acumulador
        int resultado = nombres.reduce(0, Integer::sum);
        System.out.println(resultado);

    }
}







