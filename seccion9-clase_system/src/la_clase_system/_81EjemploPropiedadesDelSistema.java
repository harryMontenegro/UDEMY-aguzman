package la_clase_system;

import java.util.Properties;

public class _81EjemploPropiedadesDelSistema {
    public static void main(String[] args) {

        // Obtener nombre de usuario
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        //Obtener ruta del home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        //Obtener ruta del proyecto
        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        //Obtener version de java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        //Obtener el separador de linea (\n)
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator " + lineSeparator + "Una linea nueva");
        //Atajo
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator " + lineSeparator2 + "Una linea nueva");


        Properties p = System.getProperties();
        // El método list() recibe por argumento un obj o instancia del tipo PrintStream, justamente lo que retorna el método out
        p.list(System.out);
    }
}
