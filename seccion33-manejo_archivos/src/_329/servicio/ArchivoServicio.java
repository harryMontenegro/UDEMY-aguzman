package _329.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        //Clase que crea un archivo en Java
        File archivo = new File(nombre);

        //Clase que escribe en el archivo, recibe el argumento de tipo File
        try {
            FileWriter escritor = new FileWriter(archivo, true);// Con el argumento append = true permite agregar contenido al archivo si este existe
            //Con el escritor.append(String) se escribe al archivo y retorna el escritor para seguir encadenando
            escritor.append("Hola que tal amigos \n")// Aunque hay varios .append(String) de forma encadenada, se escribe en el archivo en una sola línea.
                    .append("Todo bien? yo aca escribiendo un archivo\n")
                    .append("hasta luego liucas!\n");

            escritor.close();// escritor.close() es necesario cerrar el recurso para que pueda reflejarse la escritura en el archivo.
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
