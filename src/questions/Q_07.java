package questions;

public class Q_07 {

    public static void main(String[] args) {
        Integer val = 24;
        overload(val);
    }

    private static void overload(int n) {
        System.out.println("primitive");
    }
    private static void overload(Integer n) {
        System.out.println("non-primitive");
    }
}