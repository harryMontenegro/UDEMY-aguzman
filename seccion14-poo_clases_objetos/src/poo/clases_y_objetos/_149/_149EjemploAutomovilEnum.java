package poo.clases_y_objetos._149;


public class _149EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());


        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("El automovil pequeño de dos puertas y típicamente deportivo");
                break;
            case FURGON:
                System.out.println("El automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("El automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("El automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("El automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("El automovil más grande, con maleta grande...");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos) {
            System.out.print(ta + " => " + ta.name() + " " + ta.getNombre() + " " + ta.getDescripcion() + " " + ta.getNumeroPuertas());//name() corresponde al nombre original de la constante
            System.out.println();
        }
    }
}











