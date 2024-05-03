package week1;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            System.out.println(String.format("Fib(%s) = %s", num, fibonacci(num)));
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long firstNum = 0L;
        long secondNum = 1L;

        long temp;
        for (int i = 2; i <= n; i++) {
            temp = secondNum;
            secondNum += firstNum;
            firstNum = temp;
        }
        return secondNum;
    }
}
