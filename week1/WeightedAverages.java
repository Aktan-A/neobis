package week1;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class WeightedAverages {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            BigDecimal testcaseSum = BigDecimal.ZERO;
            for (int j = 0; j < 3; j++) {
                BigDecimal num = new BigDecimal(sc.next());
                switch (j) {
                    case 0:
                        num = num.multiply(BigDecimal.valueOf(2L));
                        break;
                    case 1:
                        num = num.multiply(BigDecimal.valueOf(3L));
                        break;
                    case 2:
                        num = num.multiply(BigDecimal.valueOf(5L));
                        break;
                }
                testcaseSum = testcaseSum.add(num);
            }
            System.out.println(testcaseSum.divide(BigDecimal.valueOf(10), 1, RoundingMode.HALF_UP));
        }
    }
}
