package poo.clases_y_objetos._135;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;


    public String leerFabricante(){
        return this.fabricante;
    }

    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return this.modelo;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public String leerColor(){
        return this.color;
    }

    public void asignarColor(String color){
        this.color = color;
    }

    public double leerCilindrada(){
        return this.cilindrada;
    }

    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int leerCapacidadEstanque(){
        return this.capacidadEstanque;
    }

    public void asignarCapacidadEstanque(int  capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }


    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }
}









