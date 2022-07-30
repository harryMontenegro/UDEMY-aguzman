package poo.interface_repositorio._220.repositorio;

import poo.interface_repositorio._220.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
