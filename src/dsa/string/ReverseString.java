package dsa.string;

public class ReverseString {

    public static void main(String[] args) {

        String s = "This is me";
        System.out.println(reverse(s));
    }
    private static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        return strBuilder.reverse().toString();
    }

    private static boolean reverse(String str, int l, int r) {
        char[] charArr = str.toCharArray();
        int len = charArr.length;
        int i = 0;
        while(i< len) {
            if(charArr[i] == charArr[len]){
                i++;
                len--;
            }
        }
        return false;
    }
}
