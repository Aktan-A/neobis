package week1;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            String message = checkPrimeNumber(number) ? " eh primo" : " nao eh primo";
            System.out.println(number + message);
        }
    }

    public static boolean checkPrimeNumber(int num) {
        if (num == 1) {
            return true;
        }
        //The same, you can check only numbers form 2 to sqrt(num)
        for (int j = 2; j*j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
