package tipostring.cadenas;

public class EjemploStringExtensionArchivo33 {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(i + 1));
    }
}
