package concepts.collection;

/**
 * AutoBoxing: process of converting primitive data type to non-primitive data type.
 * Example:  int -> Integer, double -> Double , long -> Long etc.
 * <p>
 * AutoUnboxing: process of converting non-primitive data type to primitive data type.
 * Example: Integer -> int, Double -> double, Long -> long etc.
 */
public class BoxingUnboxing {

    int num = 13;
    public static void main(String[] args) {
        int x = 10;
        Integer value = Integer.valueOf(x); // Auto-boxing

        Long y = 10l;
        long z = y.longValue(); // Auto-unboxing

        display();
    }

    private static void display(){
        int num =14; // Variable shadowing
        System.out.println(num);
    }
}
