package patrones_disenios._323;

import patrones_disenios._323.decorador.MayusculaDecorador;
import patrones_disenios._323.decorador.ReemplazarEspacioDecorador;
import patrones_disenios._323.decorador.ReversaDecorador;
import patrones_disenios._323.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspacioDecorador remplaza = new ReemplazarEspacioDecorador(subrayar);

        System.out.println(remplaza.darFormato());
    }
}
