package dsa.string;

public class CountRepeatedChar {

    public static void main(String[] args) {
        System.out.println(count("InterviewBit", 'i'));
    }
    private static int count(String s, char c){
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
