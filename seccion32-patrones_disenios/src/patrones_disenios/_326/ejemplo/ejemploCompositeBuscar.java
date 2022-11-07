package patrones_disenios._326.ejemplo;

import patrones_disenios._326.Archivo;
import patrones_disenios._326.Directorio;

public class ejemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);
        //System.out.println(doc.mostrar(0));

        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado \"Api Stream\": " + encontrado);

        encontrado = doc.buscar("cv.docx");
        System.out.println("Encontrado \"cv.docx\": " + encontrado);


    }
}
