package operadores;

public class _42OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127E-7F;
        double l = 2.1413E3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k < l || m == true);
        System.out.println("b3 = " + b3);

        // En la precedencia de operadores lógicos tiene prioridad el &&, en la siguiente expresión boolean b4 = i == j || k < l && m == true;
        // primero se evalúa k < l && m == true; debido a la prioridad del &&. Es equivalente a boolean b4 = i == j || (k < l && m == true);
        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);
    }
}
