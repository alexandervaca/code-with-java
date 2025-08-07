package code.example.mutualexclusion;

public class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    // Receives a message object and a string message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        // Only one thread can send a message at a time.
        synchronized (sender) {
            // Synchronizing the send object
            sender.send(msg);
        }
    }
}
