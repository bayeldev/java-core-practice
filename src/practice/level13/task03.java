package practice.level13;

import java.time.LocalDate;

public class task03 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);

        System.out.println(tomorrow);
    }
}
