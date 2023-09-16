package dsa;

import java.util.Arrays;

public class RemoveDuplicate {

    private static int[] removeDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = deleteElement(arr, j);
                }
            }
        }
        return arr;
    }

    private static int[] deleteElement(int[] arr, int j) {
        if (j < 0 || j > arr.length) return arr;

        int[] res = new int[arr.length - 1];
        for (int i = 0; i < res.length; i++) res[i] = (i < j) ? arr[i] : arr[i + 1];

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 23, 53, 26, 3, 54, 23};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        int[] a = {2, 2, 3, 3, 4, 6, 6};
        int rd = removeEff(a);
        for (int i = 0; i < rd; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static int removeEff(int[] arr) {
        int rd = 0;
        for(int i = 1; i<arr.length; i++) {
            if(arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd;
    }

    // Space Complexity and time complexity is O(n)
    private static int[] remove(int[] arr) {
        int[] temp = new int[arr.length];

        int rd = 0;
        temp[rd] = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(temp[rd] != arr[i]) {
                rd++;
                temp[rd] = arr[i];
            }
        }
        return temp;
    }
}
