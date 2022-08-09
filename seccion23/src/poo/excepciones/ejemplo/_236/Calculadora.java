package poo.excepciones.ejemplo._236;

public class Calculadora {
    // Con el operador throws se propagan las excepciones en el método
    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if (divisor == 0) {
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }
        return numerador / (double) divisor;
    }

    //Al Sobrecargar un método, y este método llama un método que lanza una Excepción, este también está obligado a hacerlo
    public double dividir(String numerador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
            //Se puede hacer uso de las excepciones no chequeada del lenguaje ejem: NumberFormatException y a trabes de una personalizada hacerla chequeada
        } catch (NumberFormatException e) {
            //NumberFormatException se convierte en una chequeada lanzando la personalizada FormatoNumeroException
            throw new FormatoNumeroException("debe ingresar un número en el numerador y divisor!");
        }
    }
}








