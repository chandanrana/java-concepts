package programming.mustknow;

import java.util.Arrays;

public class CheckVowels {
    public static void main(String[] args) {
        String s  = "Programming";
        System.out.println(Arrays.toString(checkVowels(s)));
    }

    private static char[] checkVowels(String s) {
        s = toLowerCase(s);

        System.out.println(s);
        char[] res = new char[s.length()];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] arr = s.toCharArray();
        int vowelCount=0;
        for (int i = 0; i < arr.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < vowels.length; j++) {
                if(arr[i] == vowels[j]){
                    vowelCount++;
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                res[i] = arr[i];
            }
        }
        System.out.println(vowelCount);
        return res;
    }

    private static String toLowerCase(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                res += (char)((int)s.charAt(i) + 32); // ASCII value of A = 65 and a = 97, Difference is 32
            } else{
                res += s.charAt(i);
            }

        }
        return res;
    }


}
