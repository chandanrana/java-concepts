package programming;

public class Reverse {

    static public void main(String[] args) {
        int a = 434;
        System.out.println("Reverse of number: "+reverse(a));

        String str = "Tesla";
        System.out.println("Reverse of string: "+reverse(str));
    }

    private static int reverse(int num) {
        int reverse = 0;
        while(num > 0) {
            int r = num % 10;
            reverse = (reverse * 10) + r;
            num /= 10;
        }
        return reverse;
    }

    private static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse  += str.charAt(i);
        }
        return reverse;
    }
}

