package org.aguzman._347;


import org.aguzman._347.modelo.Producto;
import org.aguzman._347.repositorio.ProductoRepositorioImpl;
import org.aguzman._347.repositorio.Repositorio;
import org.aguzman._347.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

            System.out.println("=================== listar ===================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=================== obtener por id ===================");
            System.out.println(repositorio.porId(1L));

            System.out.println("=================== eliminar producto ===================");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

















