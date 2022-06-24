package tipostring.cadenas;

public class _30EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programacion Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);


/*        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }*/

        // isBlank() es más estricto que isEmpty(), isBlank() valida que sea distinto de null, luego valida que sea
        // distinto de isEmpty y además que el contenido sea distinto a un espacio en blanco.
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
