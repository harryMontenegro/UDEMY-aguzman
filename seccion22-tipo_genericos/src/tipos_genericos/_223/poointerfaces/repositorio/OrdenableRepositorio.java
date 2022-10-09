package tipos_genericos._223.poointerfaces.repositorio;


import tipos_genericos._223.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
