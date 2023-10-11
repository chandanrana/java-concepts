package programming.mustknow;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChars {
    public static void main(String[] args) {
        String s = "programmingp";
        Map<Character, Integer> countMap = new HashMap<>();

        // Count the frequency of the characters
        for(Character c: s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }

        // Fetch the character
        for(Character c: s.toCharArray()) {
            if(countMap.get(c) == 1){
                System.out.println("First non-repeating character: "+c);
                break;
            }
        }
    }
}