package concepts;

public class Qna3 {
    static public void main(String[] args) {
        String s = "chandan";
        String s1 = new String(s);

        StringBuffer s2 = new StringBuffer("chandan");
        StringBuffer s3 = new StringBuffer("kumar");

        s1.concat("kumar");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s == s1);
        System.out.println(s2 == s3);
//        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));

    }

    
}
