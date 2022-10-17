package patrones_disenios._319;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    public static ConexionBDSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
