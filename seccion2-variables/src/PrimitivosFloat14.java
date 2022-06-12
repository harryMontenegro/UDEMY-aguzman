public class PrimitivosFloat14 {
    static float varFlotanteStatic;

    public static void main(String[] args) {

        //Siempre en la literal por defecto es entero, por lo tanto, convierte la literal del tipo entero a tipo flotante de forma automática
        //Si se especifica en la literal un decimal (1.0), pasa a por defecto al tipo double, en consecuencia, se debe especificar con la letra F
        //Cuando se usa la exponencial (2.12E3F) significa que la coma se corre 3 veces (E3) asia la derecha, dando como resultado 2120.0
        float realFloat = 2.12E3F; //2120F;
        System.out.println("realFloat = " + realFloat);

        //Cuando es positivo
        float realFloatP = 1.5E4F; // Fórmula: 1.5 * 10 elevado a la 4, se corre coma(,) a la derecha//150000.0F;
        System.out.println("realFloatN = " + realFloatP);
        //Cuando es negativo
        float realFloatN = 0.00000000015F; // 1.5E-10F; -   Fórmula: 1.5 * 10 elevado a la 10, se corre coma(,) a la izquierda;
        System.out.println("realFloatN = " + realFloatN);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bits a " + Float.SIZE);
        System.out.println("Máximo valor para float " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bits a " + Double.SIZE);
        System.out.println("Máximo valor para double " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double " + Double.MIN_VALUE);

        var varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);

        //NOTA: El valor por defecto de los primitivos es 0 siempre y cuando sean variables de tipo atributo de una clase
        //esto no aplica a variables de métodos, por lo tanto, se debe inicializar.
        System.out.println("varFlotante = " + varFlotanteStatic);

    }
}
