package dsa.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        String s1 = "Bored";
        String s2 = "Robed";
        System.out.println(isAnagram(s1, s2));
    }
    private static boolean isAnagram(String s1, String s2) {
        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s1.toCharArray();
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());
        return Arrays.equals(s1CharArr, s2CharArr);
    }
}
