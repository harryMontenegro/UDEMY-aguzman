package variables;

public class _23ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43E-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456E2;
        String otrorealStr = Double.toString(otroRealDouble);
        System.out.println("otrorealStr = " + otrorealStr);

        otrorealStr = String.valueOf(1.23456E2F);
        System.out.println("otrorealStr = " + otrorealStr);


        int i = 22768;
        //No se puede asignar un tipo int a un tipo short debido a que short guarda valores más pequeños que int, pero se puede hacer un cast.
        short s = (short) i;
        System.out.println("s = " + s);
        //Se puede asignar un tipo int a un tipo long debido a que int es de menor tamaño
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
