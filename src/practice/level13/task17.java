package practice.level13;

import java.time.LocalDate;

public class task17 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate holidayCountdownStart = today.plusDays(10);

        System.out.println("Сегодня: "+ today);
        System.out.println("Через 10 дней: "+holidayCountdownStart);
    }
}
