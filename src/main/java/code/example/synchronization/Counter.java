package code.example.synchronization;

public class Counter {

    private int c = 0; // Shared variable

    // Synchronized method to increment counter
    public synchronized void inc() {
        c++;
    }

    // Synchronized method to get counter value
    public synchronized int get() {
        return c;
    }
}
