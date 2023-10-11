package programming.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 2, 8, 9, 6};
        int[] clonedArr = arr.clone();
        System.out.println(Arrays.toString(clonedArr));
    }
}
