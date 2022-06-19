package operadores;

public class OperadoresIncrementales39 {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i;// i = i + 1; con ++ antepuesto, primero se incrementa y luego se asigna a j.

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; // con ++ pospuesto, primero se asigna i a j y después que se asigna se incrementa i
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
