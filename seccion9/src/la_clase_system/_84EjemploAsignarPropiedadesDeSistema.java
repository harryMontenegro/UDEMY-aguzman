package la_clase_system;

import java.io.FileInputStream;
import java.util.Properties;

public class _84EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            // Se carga la ruta con el archivo config.properties en una variable tipo flujo de entrada
            FileInputStream archivo = new FileInputStream("seccion9/src/la_clase_system/config.properties");
            //Se crea un obj properties con la configuración
            Properties p = new Properties(System.getProperties());
            //Se agrega la configuración creada en el archivo config.properties
            p.load(archivo);
            // Otra forma de agregar properties
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en propiedad personalizada");
            // Si imprimimos el listado de prpiedades, aun no se puede ver las propiedades nuevas agregadas en la linea 15 y 17
            System.getProperties().list(System.out);
            // Para actualizar las propiedades con las propiedades nuevas se debe usar el método setProperties(Properties p)
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.auto.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            ps.list(System.out);
            
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
    }
}















