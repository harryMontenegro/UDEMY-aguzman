package valor_vs_referencia;

class Persona{
    private String nombre;

    public String leerNombre() {
        return nombre;
    }

    public void modificarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}
public class _75PasarPorReferenciaDos {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");
        
        System.out.println("Iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de invocar el metodo test");
        test(persona);
        System.out.println("Despues de invocar el metodo test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificado");

        //NOTA: al pasar un tipo de referencia de cualquiera de las clases wrapper, no se modifica su valor, ya que son inmutables,
        //por lo tanto, Cada vez que se modifica un valor se retorna una nueva instancia
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
