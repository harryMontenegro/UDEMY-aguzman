package poo.interface_repositorio._217.repositorio;

import poo.interface_repositorio._217.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
