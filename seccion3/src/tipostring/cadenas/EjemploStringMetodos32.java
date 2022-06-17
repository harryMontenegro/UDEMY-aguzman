package tipostring.cadenas;

public class EjemploStringMetodos32 {
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


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("lenguas"));// retorna la posición si se encuentra de algun caracter o string dentro del string
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));// retorna la ultima posición si se encuentra de algun caracter o string dentro del string
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.lastIndexOf("z"));// retorna un numero negativo cuando no consigue la coincidencia, po lo tanto se puede validar si es negativo es porqye no existe
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));//Siempre recibe un string y retorna true o false
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());//Elimina los espacios en los entremos del string

    }
}
