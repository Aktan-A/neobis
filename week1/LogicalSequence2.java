package week1;

import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/en/problems/view/1145

public class LogicalSequence2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            String number = Integer.toString(i);
            if (i % x == 0) {
                number += "\n";
            } else {
                number += " ";
            }
            System.out.print(number);
        }
    }
}
