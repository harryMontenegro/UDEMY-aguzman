package tipos_genericos._231.poointerfaces.modelo;

import java.util.Objects;

//Clases POJO: Es una clase simple de java con atributos, getters y setters
public class BaseEntity {
    protected Integer id;
    private static int ultimoId;

    public BaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity base = (BaseEntity) o;
        return Objects.equals(getId(), base.getId());
    }
}
