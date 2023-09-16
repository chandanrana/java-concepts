package dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverseStr(s));

        char[] chars = reverseString(s);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    private static char[] reverseString(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = 0;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    private static String reverseStr(String s) {

        char[] temp = new char[s.length()];
        int j = 0;
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str = str.concat(String.valueOf(s.charAt(i)));
            temp[j] = s.charAt(i);
            j++;
        }
        System.out.println(str);
        System.out.println(Arrays.toString(temp));
        return "";
    }

}
