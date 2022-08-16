package javier_vazquez.seccion2._7;

public class LambdaTest {
    public static void main(String[] args) {

        FunctionTest ft = () -> System.out.println("Hola Mundo");
        //ft.saludar();
        miMetodo(ft);
    }

    public static void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}
