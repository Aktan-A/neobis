package week1;

import java.io.IOException;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double temp;
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        double c = sc.nextDouble();

        if (c > a) {
            temp = a;
            a = c;
            c = temp;
        }

        String angleType = getAngleType(a, b, c);
        String sideType = getSideType(a, b, c);
        if (angleType != null) {
            System.out.println(angleType);
        }
        if (sideType != null) {
            System.out.println(sideType);
        }

    }

    public static String getAngleType(double a, double b, double c) {
        if (a >= b + c) {
            return "NAO FORMA TRIANGULO";
        } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            return "TRIANGULO RETANGULO";
        } else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
            return "TRIANGULO OBTUSANGULO";
        } else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))){
            return "TRIANGULO ACUTANGULO";
        } else {
            return null;
        }
    }

    public static String getSideType(double a, double b, double c) {
        if (a == b && b == c) {
            return "TRIANGULO EQUILATERO";
        } else if (a == b || b == c || c == a) {
            return "TRIANGULO ISOSCELES";
        }
        return null;
    }
}
