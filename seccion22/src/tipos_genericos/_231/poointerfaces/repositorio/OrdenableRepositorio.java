package tipos_genericos._231.poointerfaces.repositorio;


import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);

}
