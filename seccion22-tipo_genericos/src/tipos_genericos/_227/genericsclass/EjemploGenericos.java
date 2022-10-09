package tipos_genericos._227.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("peregrino", "Caballo"));
        transporteCaballos.add(new Animal("grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        for (Object o : transporteCaballos){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo:" + a.getTipo());
        }

        Camion trasnMaquinas = new Camion(3);
        trasnMaquinas.add(new Maquinaria("Bulldozer"));
        trasnMaquinas.add(new Maquinaria("Grúa Horquilla"));
        trasnMaquinas.add(new Maquinaria("Perforadora"));

        for (Object o : trasnMaquinas){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubichi"));
        transAuto.add(new Automovil("Chevrolete"));

        for (Object o : transAuto){
            Automovil m = (Automovil) o;
            System.out.println(m.getMarca());
        }
    }
}






















