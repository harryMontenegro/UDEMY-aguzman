package poo.sobrecarga_metodos._176;

import static poo.sobrecarga_metodos._176.Calculadora.*;

public class _176EjemploSobreCarga {
    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10F, 5F));
        System.out.println("sumar float-int: " + sumar(10F, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0F));
        System.out.println("sumar double: " + sumar(10.0, 5.0));
        System.out.println("sumar String: " + sumar("10", "5"));
        System.out.println("sumar tres int: " + sumar(10, 5, 3));
        System.out.println("sumar 4 int: " + sumar(10, 5, 3, 4));
        System.out.println("sumar 6 int: " + sumar(10, 5, 3, 4, 6, 7));
        System.out.println("sumar float + n int: " + sumar(10.5F, 5, 9, 15));
        System.out.println("sumar 4 double: " + sumar(10.0, 5.0, 3.5, 4.5));

        //Al no existir el método que reciba 2 long busca el más compatible en la sobrecarga, en este caso selecciona el sumar(float, float)
        //ya que un long es de 64Bits al igual que float, y de no existir sumar(float, float), invocará sumar(double, double)
        System.out.println("sumar long: " + sumar(10L, 5L));
        //El @ tiene una representación en la tabla unicode en entero, por lo tanto, en la sobre carga se invoca sumar(int, int)
        System.out.println("sumar int: " + sumar(10, '@'));
        System.out.println("sumar float-int: " + sumar(10F, '@'));
    }
}

























