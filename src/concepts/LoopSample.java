package concepts;

public class LoopSample {

    public static void main(String[] args) {
//        whileLoop();
//        doWhileLoop();
        forLoop();
    }

    private static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("Hi " + i);
            int j = 0;
            while (j < 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
    }

    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("Hi " + i);
            i++;
        } while (i <= 4);
    }

    private static void forLoop() {
        for (int i = 0; i <= 4; i++) {
            for (int j=0; j<3; j++){
                System.out.println("Hello " + j);
            }
            System.out.println("Hi " + i);
        }
    }
}