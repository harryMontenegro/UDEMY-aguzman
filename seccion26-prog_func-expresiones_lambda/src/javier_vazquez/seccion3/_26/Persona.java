package javier_vazquez.seccion3._26;

public class Persona implements Comparable<Persona>{
    private int idPersona;
    private String nombre;

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
       return this.nombre.compareTo(o.getNombre());
    }
}
