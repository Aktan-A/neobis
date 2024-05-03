package week1;

import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) throws IOException {
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n);

        for (int i = 0; i < banknotes.length; i++) {
            int banknote = banknotes[i];
            int banknoteCount = 0;
            while (n >= banknote) {
                n -= banknote;
                banknoteCount++;
            }
            System.out.println(banknoteCount + " nota(s) de R$ " + banknote + ",00");
        }
    }
}