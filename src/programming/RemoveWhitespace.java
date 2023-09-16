package programming;

import java.util.Arrays;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Java Developer at Inspironlabs";
        System.out.println(removeWhitespace(str));
    }

    private static String removeWhitespace(String str) {
        String updatedChar = "";
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if(!Character.isWhitespace(currentChar)){
                updatedChar+=currentChar;
            }
        }
        return updatedChar;
    }
}
