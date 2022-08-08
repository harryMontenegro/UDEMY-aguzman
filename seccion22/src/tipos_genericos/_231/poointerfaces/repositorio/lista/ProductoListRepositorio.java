package tipos_genericos._231.poointerfaces.repositorio.lista;

import tipos_genericos._231.poointerfaces.modelo.Producto;
import tipos_genericos._231.poointerfaces.repositorio.AbstractaListRepositorio;
import tipos_genericos._231.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public void editar(Producto t) {
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
