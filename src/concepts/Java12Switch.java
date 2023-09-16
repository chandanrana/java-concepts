package concepts;

public class Java12Switch {

    public static void main(String[] args) {

        String days = "sunday";

        switch (days) {
            case "sunday"-> {
                System.out.println("6:00AM");
                int a = 10;
                System.out.println();
            }
            case "monday" -> System.out.println("5:00AM");
            default -> System.out.println("7:00AM");
        }
    }
}
