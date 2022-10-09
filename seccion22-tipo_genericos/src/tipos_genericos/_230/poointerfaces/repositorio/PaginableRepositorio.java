package tipos_genericos._230.poointerfaces.repositorio;


import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
