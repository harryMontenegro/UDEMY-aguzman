package poo.clases_y_objetos._149;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120; //Constantes se escriben en mayúscula y palabras compuesta se separan con _ y típicamente son públicas
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();//Invocación del constructor sin parámetros
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
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

    public static Color getColorPatente() {
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle(){
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
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
        return id + " " + fabricante + " " + modelo;
    }
}









