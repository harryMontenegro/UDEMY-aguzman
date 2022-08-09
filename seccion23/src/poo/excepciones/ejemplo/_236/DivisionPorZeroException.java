package poo.excepciones.ejemplo._236;

//Si se hereda de Exception DivisionPorZeroException pasa a ser CHEQUEADA, si hereda de RuntimeException seria NO CHEQUEADA
public class DivisionPorZeroException extends Exception{
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
