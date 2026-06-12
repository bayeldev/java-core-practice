package practice.level13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class task19 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
        long daysRemaining = ChronoUnit.DAYS.between(today, projectDeadline);

        System.out.println(daysRemaining);

    }
}
