package _331.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicioTryRecursosPrintWriter {

    public void crearArchivo(String nombre){
        //Clase que crea un archivo en Java
        File archivo = new File(nombre);

       //se puede pasar el recurso directo como argumento al try (), y de esta forma nos ahorramos el buffer.close() ya que este se cierra por defecto
        //PrintWriter es una alternativa a FileWriter y BufferWriter que permite usar métodos adicionales como ejemplo: println(String)
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            buffer.println("Hola que tal amigos");// A diferencia del .append() println() es void, por la tanto se debe invocar al obj (buffer)
            buffer.println("Todo bien? yo aca escribiendo un archivo");
            buffer.printf("hasta luego %s!", "Lucas");//con printf(String, Variable) se puede trabajar con formatos

            //buffer.close();// buffer.close() es necesario cerrar el recurso para que pueda reflejarse la escritura en el archivo.
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            //Clase BufferedReader se usa para leer archivos, recibe como argumento el FileReader
            String linea;
            while ((linea = reader.readLine()) != null){//Mientras la liena no sea null se itera
                sb.append(linea).append("\n");
            }
            //reader.close();
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            while (s.hasNext()){//Mientras la liena no sea null se itera
                sb.append(s.next()).append("\n");
            }
            //s.close();
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}












