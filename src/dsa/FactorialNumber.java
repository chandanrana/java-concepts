package programming;

import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial: ");
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }

    private static int findFactorial(int n) {
        int res = 1;
        if(n == 0 || n == 1)
            return res;
        for(int i = 1; i<=n; i++) {
            res *= i;
        }
        return res;
    }
}
