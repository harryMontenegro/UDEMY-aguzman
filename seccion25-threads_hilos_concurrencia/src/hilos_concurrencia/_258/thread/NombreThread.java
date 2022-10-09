package hilos_concurrencia._258.thread;

public class NombreThread extends Thread{

    //Se puede personalizar el thread mediante constructor
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicia el método run del hilo " + getName());

        for(int i = 0; i<10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName());
        }
        System.out.println("finaliza el hilo");
    }
}
