package poo.interface_repositorio._220.repositorio;

import poo.interface_repositorio._220.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
