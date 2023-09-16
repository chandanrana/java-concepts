package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for(int i=0; i< len - 1; i++ ){
            for(int j=0; j<len - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 3, 8, 3, 9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
