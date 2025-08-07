package code.example.virtualthreadv2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadExecutorExample {

    public static void main(String[] args) {

        // Instancia el ExecutorService para generar Tasks y ejecutarlas con hilos virtuales
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            // Itera un stream de integers
            IntStream.range(0, 10).forEach(i -> {
                // Envia la Task al Thread Virtual
                executor.submit(() -> {
                    System.out.println("Tarea " + i + " ejecutándose en un hilo virtual");
                    try {
                        Thread.sleep(500); // Simula una espera
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            });

        } // El executor se cierra automáticamente al salir del bloque try-with-resources
        System.out.println("Todas las tareas han sido enviadas al executor");
    }
}
