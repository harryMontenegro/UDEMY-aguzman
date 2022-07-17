package poo.sobrecarga_metodos._175;

public class _175EjemploSobreCarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("sumar int: " + cal.sumar(10, 5));
        System.out.println("sumar float: " + cal.sumar(10F, 5F));
        System.out.println("sumar float-int: " + cal.sumar(10F, 5));
        System.out.println("sumar int-float: " + cal.sumar(10, 5.0F));
        System.out.println("sumar double: " + cal.sumar(10.0, 5.0));
        System.out.println("sumar String: " + cal.sumar("10", "5"));
        System.out.println("sumar tres int: " + cal.sumar(10, 5, 3));
        System.out.println("sumar 4 int: " + cal.sumar(10, 5, 3, 4));
        System.out.println("sumar 6 int: " + cal.sumar(10, 5, 3, 4, 6, 7));
        System.out.println("sumar float + n int: " + cal.sumar(10.5F, 5, 9, 15));
        System.out.println("sumar 4 double: " + cal.sumar(10.0, 5.0, 3.5, 4.5));

        //Al no existir el método que reciba 2 long busca el más compatible en la sobrecarga, en este caso selecciona el sumar(float, float)
        //ya que un long es de 64Bits al igual que float, y de no existir sumar(float, float), invocará sumar(double, double)
        System.out.println("sumar long: " + cal.sumar(10L, 5L));
        //El @ tiene una representación en la tabla unicode en entero, por lo tanto, en la sobre carga se invoca sumar(int, int)
        System.out.println("sumar int: " + cal.sumar(10, '@'));
        System.out.println("sumar float-int: " + cal.sumar(10F, '@'));


    }
}

























