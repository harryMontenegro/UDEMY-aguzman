import javax.swing.*;

public class SistemaNumericos19 {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero Binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        //Con 0B antes del numero binario le indica al compilador corresponde a un sistema binario.
        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        //Con 0 antes del número octal le indica al compilador corresponde a un sistema octal.
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        //Con 0X antes del número hexadecimal le indica al compilador corresponde a un sistema hexadecimal.
        int numeroHex = 0X1F4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
