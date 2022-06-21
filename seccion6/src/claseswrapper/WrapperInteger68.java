package claseswrapper;

public class WrapperInteger68 {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto2;
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        String valorTvlc = "67000";
        Integer valor = Integer.valueOf(valorTvlc);
        System.out.println("valor = " + valor);

        //Nota: no se puede convertir un objeto de mayor capacidad (Integer) a uno de menor capacidad (Short y Byte)
        // Pero si se puede hacer hacia arriba ejemplo: un Integer a Long. O un Short a tipo Integer o tipo Long.
        // Cuando se pasa un rango más alto (int intObjeto = 32767) del que recibe permite hacer la conversion, pero se pierde dato o queda ambiguo
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        // Cuando se pasa un rango más alto (int intObjeto = 32767) del que recibe permite hacer la conversion, pero se pierde dato o queda ambiguo
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
