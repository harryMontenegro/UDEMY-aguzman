package org.aguzman._356.repositorio;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T> {
    List<T> listar() throws SQLException;

    T porId(Long id) throws SQLException;

    T guardar(T t) throws SQLException;

    void eliminar(Long id) throws SQLException;
}
