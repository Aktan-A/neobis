package week1;

import java.io.IOException;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            String message = checkPerfectNumber(num) ? " eh perfeito" : " nao eh perfeito";
            System.out.println(num + message);
        }
    }

    public static boolean checkPerfectNumber(int number) {
        int divisorSum = 0;
        for (int j = 1; j < number; j++) {
            if (number % j == 0) {
                divisorSum += j;
            }
        }
        return number == divisorSum;
    }
}
