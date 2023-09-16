package questions;

import java.io.IOException;

// output will be the message passed in IOException() as an argument
// default result will be null
public class Quest01 {
    public static void main(String[] args) {
        try {
            throw new IOException("this ie error");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
