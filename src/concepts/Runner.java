package concepts;

public class Runner {
    public static void main(String[] args) {
        Runnable runnable = new ThreadRunnable();
        Runnable test  = new ThreadTest();

        Runnable r1 = () -> System.out.println("Inside r1");

        Thread t1 = new Thread(() -> System.out.println("Inside r1"));
        Thread t2 = new Thread(() -> System.out.println("Inside r2"));
        t1.start();

        t2.start();

    }
}
