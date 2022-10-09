package javier_vazquez.seccion6._39;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChart = entrada.chars();
        streamChart.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                .forEach(n -> System.out.print((char) n));

        String str = "HTML, CSS, JAVASCRIPTS, JAVA, C++, C#, RUBY";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);
    }
}











