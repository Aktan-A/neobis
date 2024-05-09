package week1;

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class CaesarCipher {
    public static char[] alphabet = new char[26];
    public static HashMap<Character, Integer> alphabetIndexes = new HashMap<Character, Integer>();

    public static void main(String[] args) throws IOException {
        generateAlphabet();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String encodedText = sc.nextLine();
            int shift = Integer.parseInt(sc.nextLine());
            String decodedText = decipher(shift, encodedText);
            System.out.println(decodedText);
        }
    }

    public static void generateAlphabet() {
        int index = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet[index] = letter;
            alphabetIndexes.put(letter, index);
            index++;
        }
    }

    public static String decipher (int shift, String encodedText) {
        String decodedText = "";
        for (int i = 0; i < encodedText.length(); i++) {
            char letter = encodedText.charAt(i);
            int letterIndex = alphabetIndexes.get(letter);
            int originalLetterIndex = letterIndex - shift;
            originalLetterIndex = originalLetterIndex < 0 ? originalLetterIndex + 26 : originalLetterIndex;
            decodedText += alphabet[originalLetterIndex];
        }
        return decodedText;
    }
}
