package poo.interfaces._213.imprenta.modelo;

public interface Imprimible {

    //Las interfaces puede tener atributos, pero estos son por defecto contantes.
    //public final static String TEXTO_DEFECTO = "Imprimiendo valor por defecto";
    String TEXTO_DEFECTO = "Imprimiendo valor por defecto";

    default String imprimir(){
    //Con el modificador default en un método dentro de una interfaz indica que ese método va a contener un cuerpo o una implementación.
        return TEXTO_DEFECTO;
    }

    //String imprimir();

    static void imprimir(Imprimible imprimible) {
    //Con el static en un método dentro de una interfaz indica que ese método va a pertenecer a la Interfaz, es lógico por lo que las interfaces no tienen instancias.
        System.out.println(imprimible.imprimir());
    }
}
