package tipos_genericos._226.poointerfaces.modelo;

public class ClientePremiun extends Cliente implements Comparable<ClientePremiun>{
    public ClientePremiun(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremiun o) {
        return 0;
    }
}
