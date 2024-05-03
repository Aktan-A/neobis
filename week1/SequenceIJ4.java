package week1;

import java.io.IOException;
import java.math.BigDecimal;

public class SequenceIJ4 {
    public static void main(String[] args) throws IOException {
        BigDecimal end = new BigDecimal("2");

        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(end) <= 0; i = i.add(new BigDecimal("0.2"))) {
            for (BigDecimal j = BigDecimal.ONE; j.compareTo(BigDecimal.valueOf(3L)) <= 0; j = j.add(BigDecimal.ONE)) {
                System.out.println("I=" + i.stripTrailingZeros() + " J=" + i.add(j).stripTrailingZeros());
            }
        }

    }
}
