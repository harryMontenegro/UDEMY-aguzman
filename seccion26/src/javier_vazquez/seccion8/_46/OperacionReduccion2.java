package javier_vazquez.seccion8._46;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionReduccion2 {
    public static void main(String[] args) {

        int[] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99};

        //Funcionamiento interno de IntBinaryOperator
        int suma = IntStream.of(numeros).reduce(0, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {//Left representa el elemento identity y en cada iteración va acumulando los elementos
                return left + right;
            }
        });
        System.out.println("La suma es: " + suma);

        //Representación de IntBinaryOperator en una expresión lambda
        /*int suma2 = IntStream.of(numeros).reduce(0, (left, right) -> left + right);*/
        int suma2 = IntStream.of(numeros).reduce(0, Integer::sum);
        System.out.println("La suma es: " + suma2);

        Path path1 = Paths.get("/Users/felipeaguirre/IdeaProjects/UDEMY-aguzman/seccion26/src/javier_vazquez/seccion8/_46/Parrafo.txt");
        String texto = "";
        try (Stream<String> lines = Files.lines(path1)) {
            texto = lines.map(linea -> linea.replace(",", ""))
                    .reduce("", (linea1, linea2) -> linea1.concat("\n").concat(linea2));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/felipeaguirre/IdeaProjects/UDEMY-aguzman/seccion26/src/javier_vazquez/seccion8/_46/Parrafo2.txt"))) {
            bw.write(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}











