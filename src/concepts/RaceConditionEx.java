package concepts;

/**
 * Race Condition: It's a condition where same resource can be accessed by the multiple thread at the same time
 * and may change the data.
 * It is also called a concurrency bug.
 * It's closely related to deadlock in java.
 */

class Counter {
    public int count;

    public synchronized void increment() {
        count++;
    }
}

public class RaceConditionEx {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
