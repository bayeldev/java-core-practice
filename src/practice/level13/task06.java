package practice.level13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class task06 {
    public static void main(String[] args) {
        LocalDate userBirthDate = LocalDate.of(1990, 12, 15);
        DayOfWeek dayOfWeek = userBirthDate.getDayOfWeek();

        System.out.println("День недели для 15 декабря 1990 года: "+dayOfWeek);
    }
}
