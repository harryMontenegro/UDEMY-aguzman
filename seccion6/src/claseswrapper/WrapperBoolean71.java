package claseswrapper;

public class WrapperBoolean71 {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = primBoolean;
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        // Los tipos de referencia Boolean no se comportan igual a los otros como Integer
        //Estos se pueden comprar con el == o con equals, es por eso que al comprar objBoolean == objBoolean2 es true porque lo hace por valor
        System.out.println("Comparando 2 objetos boolean " + (objBoolean == objBoolean2));
        System.out.println("Comparando 2 objetos boolean " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando 2 objetos boolean " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando 2 objetos boolean " + (objBoolean == objBoolean3));

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }

}
