package org.aguzman._343;

import org.aguzman._340.util.ConexionBaseDatos;
import org.aguzman._343.modelo.Producto;
import org.aguzman._343.repositorio.ProductoRepositorioImpl;
import org.aguzman._343.repositorio.Repositorio;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            repositorio.listar().forEach(System.out::println);

            System.out.println(repositorio.porId(1L));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

















