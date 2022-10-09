package api_stream._288;

import java.util.stream.Stream;

public class _287EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierres", "Pepe Mena", "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                // distinct() operador que elimina los elementos duplicados
                .distinct();


        //reduce() operador de reduccion, entre los elemntos del del stream y retorna un solo resultado del mismo tipo, sirve como acumulador
        String resultado = nombres.reduce("resultado concatenacion = ", (a, b) -> a + ", " + b);
        System.out.println(resultado);

    }
}







