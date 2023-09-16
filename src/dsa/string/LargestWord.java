package dsa.string;

import java.util.Arrays;

public class LargestWord {
    public static void main(String[] args) {
        String s = "Programming is fun if you understand it";
        System.out.println(Arrays.toString(sortElmByLargestWordCount(s, 3)));
    }

    private static String theFirstLargestWordCount(String s) {
        int maxLen = 0;
        String maxLenWord = "";
        String[] arr = s.split(" ");
        for (String value : arr) {
            int currWordLen = value.length();
            if (currWordLen > maxLen) {
                maxLen = currWordLen;
                maxLenWord = value;
            }
        }
        return maxLenWord + ", size: " + maxLen;
    }

    private static String[] sortElmByLargestWordCount(String s, int n) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int prevWordLen = arr[i].length();
            for (int j = i + 1; j < arr.length; j++) {
                int nextWordLen = arr[j].length();
                if (nextWordLen > prevWordLen) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(n + " largest word: " + arr[n] + " & count: " + arr[n].length());
        return arr;

        /*
        1. Split String with space. Will get an array of String(Word)
        2. Iterate each other with other words
        3. Check if the current word length is less than the next word length
        4. If yes, then swap the words
        5. You will get the sorted words in the array.
         */
    }
}