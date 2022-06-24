package variables;

public class _18SistemaNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero Binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //Con 0B antes del numero binario le indica al compilador corresponde a un sistema binario.
        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        //Con 0 antes del número octal le indica al compilador corresponde a un sistema octal.
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        //Con 0X antes del número hexadecimal le indica al compilador corresponde a un sistema hexadecimal.
        int numeroHex = 0X1F4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
