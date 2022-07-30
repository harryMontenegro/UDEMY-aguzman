package poo.interface_repositorio._219.repositorio;

import poo.interface_repositorio._219.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
