package code.example.test;

public class Geeks {

    public static void main(String args[]) {
        // only one object
        final Test O = new Test();

        Thread a = new Thread() {
            public void run() {
                O.test_func(15);
            }
        };

        Thread b = new Thread() {
            public void run() {
                O.test_func(30);
            }
        };

        a.start();
        b.start();
    }
}
