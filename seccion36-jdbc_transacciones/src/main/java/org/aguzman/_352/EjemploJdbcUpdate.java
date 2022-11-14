package org.aguzman._352;


import org.aguzman._352.modelo.Categoria;
import org.aguzman._352.modelo.Producto;
import org.aguzman._352.repositorio.ProductoRepositorioImpl;
import org.aguzman._352.repositorio.Repositorio;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

            System.out.println("=================== listar ===================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=================== obtener por id ===================");
            System.out.println(repositorio.porId(1L));

            System.out.println("=================== editar producto ===================");
            Producto producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Corsair k95 mecánico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito");
            repositorio.listar().forEach(System.out::println);
    }
}

















