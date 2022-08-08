package tipos_genericos._228.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a : camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo:" + ((Animal)a).getTipo());
            }else if (a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("peregrino", "Caballo"));
        transporteCaballos.add(new Animal("grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> trasnMaquinas = new Camion<>(3);
        trasnMaquinas.add(new Maquinaria("Bulldozer"));
        trasnMaquinas.add(new Maquinaria("Grúa Horquilla"));
        trasnMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(trasnMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubichi"));
        transAuto.add(new Automovil("Chevrolete"));

        imprimirCamion(transAuto);
    }
}






















