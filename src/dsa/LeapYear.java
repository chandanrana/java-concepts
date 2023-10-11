package programming.mustknow;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean leap = false;

        // year is divisible by 4
        if(year % 4 == 0) {
            // If year is century ending with 00
            if(year % 100 == 0) {
                // If year is divisible by 400
                // then year is leap year
                leap = year % 400 == 0;
            } else {
                    leap = true;
            }
        }
        return leap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
    }
}
