package programming.mustknow;

public class SwapNumber {

    public static void main(String[] args) {
        int a = 15, b = 10;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        a = a -b;  // -2
        b = b + a; // 3
        a = b - a;
        System.out.println("a=" + a + ", b=" + b);
    }
}
