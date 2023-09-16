package questions;

public class StringQuestion06 {
    public static void main(String[] args) {
        String s1 = 25+25+" Value "+1+4;
        String s2 = new String("Text");
        System.out.println(s1); // 50 Value 14
        System.out.println(s1.concat(s2)); // 50 Value 14Text
    }
}