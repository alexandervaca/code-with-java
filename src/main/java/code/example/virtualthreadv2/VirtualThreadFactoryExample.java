package code.example.virtualthreadv2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class VirtualThreadFactoryExample {

    public static void main(String[] args) {
        ThreadFactory virtualThreadFactory = Thread.ofVirtual().factory();
        try (ExecutorService executor = Executors.newFixedThreadPool(2, virtualThreadFactory)) {
            for (int i = 0; i < 5; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    System.out.println("Tarea " + taskId + " ejecutándose en un hilo virtual creado por la fábrica");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }
        System.out.println("Todas las tareas han sido enviadas al executor (con fábrica)");
    }
}
