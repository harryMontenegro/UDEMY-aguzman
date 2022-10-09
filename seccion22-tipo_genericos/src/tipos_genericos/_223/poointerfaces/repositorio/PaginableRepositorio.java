package tipos_genericos._223.poointerfaces.repositorio;

import tipos_genericos._223.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
