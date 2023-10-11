package programming.mustknow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb"; // bdsfgklgsk
        System.out.println(findNonRepeating(s));
    }

    private static String findNonRepeating(String s) {
        String longestSubstring = "";
        int longestSubstringLen = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                i = map.get(arr[i]);
                map.clear();
            }

            if(map.size() > longestSubstringLen) {
                longestSubstringLen = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        return longestSubstring;
    }
}
