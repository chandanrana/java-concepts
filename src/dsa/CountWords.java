package programming;

public class CountWords {
    public static void main(String[] args) {

        System.out.println(count("This is me "));
    }

    private static int count(String str) {
        int count = 1;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch) && str.charAt(i+1) != ' ') {
                ++count;
            }
        }
        return count;
    }
}
