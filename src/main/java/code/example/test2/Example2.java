package code.example.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Example2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hilo principal inicio");

        AtomicInteger atomicInteger = new AtomicInteger(0);

        // Instancia el ExecutorService para generar Tasks y ejecutarlas con hilos virtuales
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            // Itera un stream de integers
            IntStream.range(0, 10).forEach(i -> {
                // Envia la Task al Thread Virtual
                executor.submit(() -> {
                    var atomicInt = atomicInteger.getAndAdd(i);
                    System.out.println("Tarea " + atomicInt + " ejecutandose en un hilo virtual");
                    try {
                        Thread.sleep(500); // Simula una espera
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            });
        } // El executor se cierra automaticamente al salir del bloque try-with-resources
        System.out.println("Todas las tareas han sido enviadas al executor");
    }
}
