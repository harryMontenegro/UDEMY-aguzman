package org.aguzman._359;


import org.aguzman._359.modelo.Categoria;
import org.aguzman._359.modelo.Producto;
import org.aguzman._359.repositorio.CategoriaRepositorioImpl;
import org.aguzman._359.repositorio.ProductoRepositorioImpl;
import org.aguzman._359.repositorio.Repositorio;
import org.aguzman._359.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            try {
                if (conn.getAutoCommit()) {
                    conn.setAutoCommit(false);
                }
                Repositorio<Categoria> repositorioCategoria = new CategoriaRepositorioImpl(conn);
                System.out.println("=================== Insertar nueva categoria ===================");
                Categoria categoria = new Categoria();
                categoria.setNombre("Electrohogar");
                Categoria nuevaCategoria = repositorioCategoria.guardar(categoria);
                System.out.println("Categoria guardada con éxito: " + nuevaCategoria.getId());


                Repositorio<Producto> repositorio = new ProductoRepositorioImpl(conn);

                System.out.println("=================== listar ===================");
                repositorio.listar().forEach(System.out::println);

                System.out.println("=================== obtener por id ===================");
                System.out.println(repositorio.porId(1L));

                System.out.println("=================== insertar nuevo producto ===================");
                Producto producto = new Producto();
                producto.setNombre("Refrigerador2 Samsung");
                producto.setPrecio(9900);
                producto.setFechaRegistro(new Date());
                producto.setSku("abcdefg123");
                producto.setCategoria(nuevaCategoria);
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito: " + producto.getId());
                repositorio.listar().forEach(System.out::println);

                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                conn.rollback();
            }
        }
    }
}

















