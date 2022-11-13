package _331.servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicioTryRecursosBufferWriter {

    public void crearArchivo(String nombre){
        //Clase que crea un archivo en Java
        File archivo = new File(nombre);

       //se puede pasar el recurso directo como argumento al try (), y de esta forma nos ahorramos el buffer.close() ya que este se cierra por defecto
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            buffer.append("Hola que tal amigos \n")// Aunque hay varios .append(String) de forma encadenada, se escribe en el archivo en una sola línea.
                    .append("Todo bien? yo aca escribiendo un archivo\n")
                    .append("hasta luego liucas!\n");

            //buffer.close();// buffer.close() es necesario cerrar el recurso para que pueda reflejarse la escritura en el archivo.
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
