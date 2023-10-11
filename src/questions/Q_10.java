package questions;

import java.util.Arrays;

public class Q_09 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i =5; i > 0; i--)
            arr[5 -i] = i;
        // arr[0] = 5
        // arr[1] = 4
        // arr[2] = 3
        // arr[3] = 2
        // arr[4] = 1

        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 1, 4, 8);  // arr will be replaced with 8 from 1 index to 3 included.

        System.out.println(Arrays.toString(arr));
    }

}
