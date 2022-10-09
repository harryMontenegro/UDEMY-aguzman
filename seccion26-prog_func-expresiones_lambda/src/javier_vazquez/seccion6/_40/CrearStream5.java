package javier_vazquez.seccion6._40;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CrearStream5 {
    public static void main(String[] args) {

        Path path1 = Paths.get("/Users/felipeaguirre/IdeaProjects/UDEMY-aguzman/seccion26/src/javier_vazquez/seccion6/_40/Parrafo.txt");

        try (Stream<String> lines = Files.lines(path1)){
          lines.forEach(linea ->{
              System.out.println("Linea...");
              System.out.println(linea);
          });
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println();
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivo de proyecto para: %s es %n", dir.toAbsolutePath());

        try (Stream<Path> path = Files.walk(dir)){
            path.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}








