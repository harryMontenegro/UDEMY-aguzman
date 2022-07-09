package poo.clases_y_objetos._142;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico = 30;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque(){
        return this.capacidadEstanque;
    }

    public void setCapacidadEstanque(int  capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + modelo +
                "\nauto.color = " + this.color +
                "\nauto.papetnte = " + colorPatente +
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

    //Ejemplo de un método estático con atributo de la clase, da error
    //En un método estático no se puede usar atributos de instancia o atributo no estático
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override //Anotación que le indica al compilador que estamos sobreescribiendo, es informativo
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return fabricante + " " + modelo;
    }
}









