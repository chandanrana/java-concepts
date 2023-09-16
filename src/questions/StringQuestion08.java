package questions;

public class StringQuestion08 {
    public static void main(String[] args) {
        String str1 = "xyz";
        str1.concat("pqr");
        System.out.println(str1); // xyz: As result of concat is not assigned to the string. So str1 will not change.
        String str2 = str1.concat("pqr").toUpperCase().replace("Y", "d");
        System.out.println(str2); //XdZPQRPQR: changes are assigned to str2
    }
}
