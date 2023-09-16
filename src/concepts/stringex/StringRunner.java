package concepts.stringex;

public class StringRunner {

    public static void main(String[] args) {

        String s1 = "chandan";
        String s2 = "chandan";

        System.out.println("index: "+ s1.indexOf("t")); // -1

        System.out.println(s1 == s2);
        // README: TRUE - because both s1 and s2 pointing to the same variable in String Constant Pool

        System.out.println(s1.equals(s2)); // TRUE

        String s3 = new String("chandan");
        // README: This will create new object in heap memory even if the same string is present in the string pool

        System.out.println(s3 == s1); // FALSE
        System.out.println(s1.equals(s3)); // TRUE

    }
}
