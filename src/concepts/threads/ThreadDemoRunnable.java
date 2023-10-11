package concepts.threads;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        for(int i=0; i< 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread, id: "+ Thread.currentThread().getId() + " - "+ i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        for(int i=0; i< 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread, id"+ Thread.currentThread().getId() + " - "+ i);
        }
    }
}
