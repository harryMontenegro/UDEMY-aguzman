package poo.excepciones.ejemplo._238.repositorio.lista;



import poo.excepciones.ejemplo._238.modelo.Cliente;
import poo.excepciones.ejemplo._238.repositorio.AbstractaListRepositorio;
import poo.excepciones.ejemplo._238.repositorio.Direccion;
import poo.excepciones.ejemplo._238.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void editar(Cliente t) throws LecturaAccesoDatoException {
        Cliente c = this.porId(t.getId());
        c.setNombre(t.getNombre());
        c.setApellido(t.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
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

    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "nombre":
                resultado = a.getNombre().compareTo(b.getNombre());
                break;
            case "apellido":
                resultado = a.getApellido().compareTo(b.getApellido());
                break;
        }
        return resultado;
    }
}













