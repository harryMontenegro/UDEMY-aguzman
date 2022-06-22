package valor_vs_referencia;

public class PasarPorReferencia74 {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("Iniciamos el método main");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[" + i + "] = " + edad[i]);
        }

        System.out.println("Antes de invocar el metodo test");
        test(edad);
        System.out.println("Despues de invocar el metodo test");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificado");

        //NOTA: al pasar un tipo de referencia de cualquiera de las clases wrapper, no se modifica su valor, ya que son inmutables,
        //por lo tanto, Cada vez que se modifica un valor se retorna una nueva instancia
    }

    public static void test(int[] edadArr){

        System.out.println("Iniciamos el método test");
        for(int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el método test");
    }
}
