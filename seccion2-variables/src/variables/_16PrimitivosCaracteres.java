package variables;

public class _16PrimitivosCaracteres {
    public static void main(String[] args) {

        // \u0040 representa secuencia de escape de un carácter de la tabla unicode
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("carácter = " + caracter);
        System.out.println("decima = " + decimal);
        System.out.println("decimal = carácter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("símbolo = " + simbolo);
        System.out.println("símbolo = carácter: " + (simbolo == caracter));

        var varCaracter1 = '@';
        var varCaracter2 = 64;
        System.out.println("varCaracter2 = " + varCaracter2);

        char espacio1 = ' ';
        char espacio2 = '\u0020';
        char retroceso = '\b'; //Retroceso, elimina el carácter hacia atrás
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';// Retrocede y reicia la linea, depende del sistema operativo

        System.out.println("char corresponde en \tbyte:" + System.lineSeparator() + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bits " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
    }
}
