package java8;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","", "");
        sj.add("Red");
        sj.add("blue");
        sj.add("green");
        System.out.println(sj); // [Red,blue,green]
    }
}
