package neo.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Sorry, this program is just an example of some Java code.");
        System.out.println("Meaning, it does not do anything interesting...");

        if (name.length() > 10) {
            System.out.println("But it has identified that you have a pretty long name!");
        } else {
            System.out.println("But it has identified that you have a pretty short name!");
        }

    }
}