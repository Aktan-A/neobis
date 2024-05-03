package week1;

import java.io.IOException;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDateTime start = LocalDateTime.of(currentDate, LocalTime.of(startHour, startMinute));
        LocalDateTime end = LocalDateTime.of(currentDate, LocalTime.of(endHour, endMinute));

        if (end.isBefore(start) || end.isEqual(start)) {
            end = end.plusDays(1L);
        }

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();

        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
    }
}
