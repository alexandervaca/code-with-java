package code.example.test2;

import java.util.concurrent.atomic.AtomicInteger;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Thread t1 = new Thread(() -> System.out.println(atomicInteger.incrementAndGet()));
        Thread t2 = new Thread(() -> System.out.println(atomicInteger.incrementAndGet()));

        t1.start();
        t2.start();
        Thread.sleep(1L);
    }
}
