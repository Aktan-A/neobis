package week1;

import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;

public class PopulationIncrease {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int populationA = sc.nextInt();
            int populationB = sc.nextInt();
            BigDecimal growth1 = new BigDecimal(sc.next());
            growth1 = growth1.divide(BigDecimal.valueOf(100));
            BigDecimal growth2 = new BigDecimal(sc.next());
            growth2 = growth2.divide(BigDecimal.valueOf(100));

            int years = 0;
            while (populationA <= populationB) {
                populationA += growth1.multiply(BigDecimal.valueOf(populationA)).intValue();
                populationB += growth2.multiply(BigDecimal.valueOf(populationB)).intValue();
                years++;
                if (years > 100) {
                    break;
                }
            }
            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }
        }
    }
}
