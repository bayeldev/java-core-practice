package practice.level13;

import java.time.LocalDate;

public class task18 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate futureMilestone = LocalDate.of(2025, 1, 1);

        if(futureMilestone.isBefore(today)) {
            System.out.println("2025 уже наступил");
        } else {
            System.out.println("2025 еще не наступил");
        }
    }
}
