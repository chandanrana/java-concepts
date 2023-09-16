package programming;

public class fibonacciSeries {

    public static void main(String[] args) {
        series(10);
    }

    private static void series(int count) {
        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " "+second);
        for(int i = 2; i < count; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(" "+next);
        }
    }
}

