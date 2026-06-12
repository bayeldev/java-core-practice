package practice.level13;

import java.time.LocalDate;

public class task02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        System.out.println(yesterday);
    }
}
