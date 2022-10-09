package tipos_genericos._231.poointerfaces.repositorio;

//El extends en interfaces si soporta herencia multiple, pero solo herencia entre interfaces
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>, PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
