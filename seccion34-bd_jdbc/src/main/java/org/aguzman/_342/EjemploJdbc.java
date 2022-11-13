package org.aguzman._342;

import org.aguzman._340.util.ConexionBaseDatos;
import org.aguzman._342.modelo.Producto;
import org.aguzman._342.repositorio.ProductoRepositorioImpl;
import org.aguzman._342.repositorio.Repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            repositorio.listar().forEach(p -> System.out.println(p.getNombre()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

















