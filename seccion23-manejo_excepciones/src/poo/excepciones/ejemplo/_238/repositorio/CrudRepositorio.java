package poo.excepciones.ejemplo._238.repositorio;


import poo.excepciones.ejemplo._238.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    //Al especificarse en una interfaz se debe lanzar la más genérica aunque en la implementación del método se lance la más concreta, siempre y cuando tenga relación de herencia
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
