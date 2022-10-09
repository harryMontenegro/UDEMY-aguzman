package tipostring.cadenas;

public class _31EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andrés\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"Andres\") = " + nombre.equalsIgnoreCase("Andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));// substring(int desde) es inclusive es decir se va a tomar en cuenta desde la n adelante
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); // substring(int desde, int hasta) el desde es inclusive y el hasta es exclusive
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 5));
        System.out.println("nombre.substring(5) = " + nombre.substring(nombre.length() - 2));
    }
}
