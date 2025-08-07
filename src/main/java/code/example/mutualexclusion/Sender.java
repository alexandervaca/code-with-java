package code.example.mutualexclusion;

public class Sender {

    public void send(String msg) {
        System.out.println("Sending " + msg);  // Changed to print without new line
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println(msg + "Sent");  // Improved output format
    }
}
