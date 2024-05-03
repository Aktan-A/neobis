package week1;

import java.io.IOException;
import java.util.Scanner;


public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {
        int[] banknotes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coinInts = {100, 50, 25, 10, 5, 1};
        double[] coins = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
        Scanner sc = new Scanner(System.in);
        Double doublen = (double) Math.round(sc.nextDouble() * 100);
        int n = doublen.intValue();

        System.out.println("NOTAS:");
        for (int i = 0; i < banknotes.length; i++) {
            int banknote = banknotes[i];
            int banknoteCount = 0;
            while (n >= banknote) {
                n -= banknote;
                banknoteCount++;
            }
            System.out.println(banknoteCount + " nota(s) de R$ " + banknote / 100 + ".00");
        }

        System.out.println("MOEDAS:");
        for (int j = 0; j < coinInts.length; j++) {
            int coin = coinInts[j];
            int coinCount = 0;
            while (n >= coin) {
                n -= coin;
                coinCount++;
            }
            System.out.println(coinCount + " moeda(s) de R$ " +  String.format("%.2f", coins[j]));
        }

    }
}
