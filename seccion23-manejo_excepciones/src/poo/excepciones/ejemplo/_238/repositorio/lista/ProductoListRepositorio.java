package poo.excepciones.ejemplo._238.repositorio.lista;


import poo.excepciones.ejemplo._238.modelo.Producto;
import poo.excepciones.ejemplo._238.repositorio.AbstractaListRepositorio;
import poo.excepciones.ejemplo._238.repositorio.Direccion;
import poo.excepciones.ejemplo._238.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;


public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public void editar(Producto t) throws LecturaAccesoDatoException {
        Producto p = porId(t.getId());
        p.setDescripcion(t.getDescripcion());
        p.setPrecio(t.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "descripcion":
                resultado = a.getDescripcion().compareTo(b.getDescripcion());
                break;
            case "precio":
                resultado = a.getPrecio().compareTo(b.getPrecio());
                break;
        }
        return resultado;
    }
}
