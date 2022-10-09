package tipos_genericos._222.poointerfaces.repositorio;

//El extends en interfaces si soporta herencia multiple, pero solo herencia entre interfaces
public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio, PaginableRepositorio, CrudRepositorio, ContableRepositorio {
}
