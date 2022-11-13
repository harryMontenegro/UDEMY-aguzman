package _331;

import _331.servicio.ArchivoServicioTryRecursosPrintWriter;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";

        ArchivoServicioTryRecursosPrintWriter service = new ArchivoServicioTryRecursosPrintWriter();
        System.out.println(service.leerArchivo(nombreArchivo));

        System.out.println(service.leerArchivo2(nombreArchivo));
    }
}
