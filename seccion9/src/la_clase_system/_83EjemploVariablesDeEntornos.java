package la_clase_system;

import java.util.Map;

public class _83EjemploVariablesDeEntornos {
    public static void main(String[] args) {

        // Con el método System.getenv() se obtiene un Map de todas las variables de ambiente del sistema operativo
        Map<String, String> varEnv = System.getenv();
        System.out.println("variable de ambiente del sistem = " + varEnv);

        System.out.println("------------Listando las varibles de entorno del sistema------------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + "=>" + varEnv.get(key));
        }

        //NOTA: Las variables de ambiente tienen mucha semejanza con las propiedades de sistema y
        //estas variables están especificadas en mayúscula

        //Obtener nombre de usuario
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        //Obtener ruta java home
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        //Obtener ruta temporal
        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);
        //Obtener ruta path
        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        //También se puede extraer los valores desde el Mapa (varEnv) con el método get("nombre")
        String path2 = varEnv.get("PATH");
        System.out.println("PATH2 = " + path2);

        //NOTA: Aca en esta clase hace ejemplos de agregar variables de entornos en el SO y luego listarlas aca.

    }
}
