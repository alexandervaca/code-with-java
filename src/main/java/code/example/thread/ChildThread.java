package code.example.thread;

// Class 2
// Helper class extending Thread class
// Child Thread class
public class ChildThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            // Print statement whenever child thread is called
            System.out.println("Child thread");
        }
    }
}
