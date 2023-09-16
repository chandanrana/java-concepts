package dsa.string;

//  Write a program to calculate the total number of characters in the String?
public class StringCharCount {
    public static void main(String[] args) {

        String s = "Hello There! ";
        System.out.println(count(s));
    }

    private static int count(String s) {
        int count = 0;

        if(s.isEmpty()) return count;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
