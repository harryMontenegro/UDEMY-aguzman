package _330.servicio;

import java.io.*;

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
}
