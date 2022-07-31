package tipos_genericos._222.poointerfaces.repositorio;


import tipos_genericos._222.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
