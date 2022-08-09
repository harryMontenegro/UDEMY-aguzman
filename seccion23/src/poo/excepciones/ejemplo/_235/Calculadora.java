package poo.excepciones.ejemplo._235;

public class Calculadora {

    // Con el operador throws se propagan las excepciones en el método
    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if(divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }
        return numerador / (double) divisor;
    }
}
