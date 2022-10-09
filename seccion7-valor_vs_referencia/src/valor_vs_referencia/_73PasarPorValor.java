package valor_vs_referencia;

public class _73PasarPorValor {
    public static void main(String[] args) {

        Integer i = 10;

        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i);

        //NOTA: al pasar un tipo de referencia de cualquiera de las clases wrapper, no se modifica su valor, ya que son inmutables,
        //por lo tanto, Cada vez que se modifica un valor se retorna una nueva instancia
    }


    public static void test(Integer i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

















}
