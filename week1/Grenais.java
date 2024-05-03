package week1;

import java.io.IOException;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int grenais = 0;
        int interVictories = 0;
        int gremioVictories = 0;
        int draws = 0;

        int response;
        do {
            grenais++;
            int interGoals = sc.nextInt();
            int gremioGoals = sc.nextInt();
            if (interGoals > gremioGoals) {
                interVictories++;
            } else if (gremioGoals > interGoals) {
                gremioVictories++;
            } else {
                draws++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            response = sc.nextInt();

        } while (response == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interVictories);
        System.out.println("Gremio:" + gremioVictories);
        System.out.println("Empates:" + draws);

        String largestGrenaisWinnerMessage = "Não houve vencedor";
        if (interVictories > gremioVictories) {
            largestGrenaisWinnerMessage = "Inter venceu mais";
        } else if (gremioVictories > interVictories) {
            largestGrenaisWinnerMessage = "Gremio venceu mais";;
        }
        System.out.println(largestGrenaisWinnerMessage);
    }
}
