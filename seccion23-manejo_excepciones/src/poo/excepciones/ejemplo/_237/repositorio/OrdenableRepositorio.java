package poo.excepciones.ejemplo._237.repositorio;


import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);

}
