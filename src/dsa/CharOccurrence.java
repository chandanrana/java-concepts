package dsa;

import java.util.Arrays;

public class CharOccurrence {

    public static void main(String[] args) {
        String s = "abbababc";
        String p = "ba";

        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == p.charAt(0) && arr[i+1] == p.charAt(1)){
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}
