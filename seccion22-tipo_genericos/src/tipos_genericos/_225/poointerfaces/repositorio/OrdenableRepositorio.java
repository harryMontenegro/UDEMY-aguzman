package tipos_genericos._225.poointerfaces.repositorio;


import tipos_genericos._225.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
