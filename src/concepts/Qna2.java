package concepts;

public class Qna2 {
    public static void main(String[] args) {
        System.out.println(getNum());
    }

    private static int getNum() {
        try {
//            System.exit(0);
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }
}
