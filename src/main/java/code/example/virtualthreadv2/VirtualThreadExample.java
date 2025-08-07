package code.example.virtualthreadv2;

public class VirtualThreadExample {

    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            System.out.println("Ejecutando en un hilo virtual");
            // Aquí puedes realizar operaciones que bloqueen, como operaciones de E/S
            try {
                Thread.sleep(1000); // Simula una espera
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Finalizando en un hilo virtual");
        });

        System.out.println("Hilo principal sigue ejecutándose");
    }
}
