package api_stream._288;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _287EjemploStreamRange {
    public static void main(String[] args) {

        //IntStream es una especializacion de stream para enteros, que tienen metodos especializados
        IntStream num = IntStream
                .range(5, 20)//Primer argumento Inclusive y el segundo exclusive
                .peek(System.out::println);

        //reduce() operador de reduccion, entre los elemntos del del stream y retorna un solo resultado del mismo tipo, sirve como acumulador
        //int resultado = num.reduce(0, Integer::sum);

        //Metodo .sum() es un metodo perteneciente al la interfas IntStream
        //int resultado = num.sum();


        // la clase IntSummaryStatistics es una clase que posee varios metodos para operar sobre IntStream, cada tipo de referencia posee su clase especializada, ejm: DoubleSummaryStatistics etc
        // Metodo summaryStatistics() es un metodo especializado de IntStream que retorna un obj de tipo IntSummaryStatistics
        IntSummaryStatistics resultado = num.summaryStatistics();
        System.out.println("Maximo: " + resultado.getMax());
        System.out.println("Minimo: " + resultado.getMin());
        System.out.println("Suma: " + resultado.getSum());
        System.out.println("Promedio: " + resultado.getAverage());
        System.out.println("Total Elementos: " + resultado.getCount());
    }
}







