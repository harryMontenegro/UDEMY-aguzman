package hilos_concurrencia._262.runnable;

import static hilos_concurrencia._262.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable{
    private String frase1;
    private String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);
    }
}
