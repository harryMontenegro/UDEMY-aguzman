package hilos_concurrencia._271.ejemploexecutorfuture.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    // No se puede hacer uso de los métodos wait() y notify() si no se especifica el modificador synchronized
    public synchronized void hornear(String masa){
        while (disponible){
            try {
                wait();    // No se puede hacer uso de los métodos wait() y notify() si no se especifica el modificador synchronized
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify();    // No se puede hacer uso de los métodos wait() y notify() si no se especifica el modificador synchronized
    }

    public synchronized String consumir(){
        while (!disponible){
            try {
                wait();    // No se puede hacer uso de los métodos wait() y notify() si no se especifica el modificador synchronized
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente consume: " +this.pan);
        this.disponible = false;
        notify();    // No se puede hacer uso de los métodos wait() y notify() si no se especifica el modificador synchronized
        return pan;
    }
}
