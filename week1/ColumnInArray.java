package week1;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        String operation = sc.next();
        BigDecimal columnSum = BigDecimal.ZERO;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                BigDecimal value = new BigDecimal(sc.next());
                if (j == column) {
                    columnSum = columnSum.add(value);
                }
            }
        }

        if (operation.equals("S")) {
            System.out.println(columnSum);
        } else {
            BigDecimal columnAverage = columnSum.divide(BigDecimal.valueOf(12), 1, RoundingMode.HALF_UP);
            System.out.println(columnAverage);
        }

    }
}
