package operadores;

public class OperadoresLogicos41 {
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
    }
}
