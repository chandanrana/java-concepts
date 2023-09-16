package concepts.exception;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Before exception");
            System.out.println(1/0);
            System.out.println("After exception");
        } catch(Exception e) {
//            System.out.println("In catch block");
        }
        System.out.println("Outside try-catch");
    }
}
