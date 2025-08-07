package code.example.volatil;

public class Geeks {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.start();

        Thread.sleep(600); // Let it run briefly
        counter.stop();    // Then stop the thread
    }
}


