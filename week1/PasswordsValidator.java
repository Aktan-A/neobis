package week1;

import java.io.IOException;
import java.util.Scanner;

public class PasswordsValidator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String password = sc.nextLine();
            if (validatePassword(password)) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }

    public static boolean validatePassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;

        if (password.length() < 6 || password.length() > 32) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (!Character.isLetterOrDigit(character) || Character.isWhitespace(character)) {
                return false;
            }
            if (!hasUppercase && Character.isUpperCase(character)) {
                hasUppercase = true;
            } else if (!hasLowercase && Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if (!hasNumber && Character.isDigit(character)) {
                hasNumber = true;
            }
        }

        return hasUppercase && hasLowercase && hasNumber;
    }
}
