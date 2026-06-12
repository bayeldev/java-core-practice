package practice.level13;

import java.time.LocalDate;
import java.time.LocalTime;

public class task07 {
    public static void main(String[] args) {
        LocalTime morningMeeting = LocalTime.of(8, 0);
        LocalTime afternoonPresentation = LocalTime.of(14,30);

        if(afternoonPresentation.isAfter(morningMeeting)) {
            System.out.println("8:00 раньше 14:30");
        } else {
            System.out.println("8:00 не раньше 14:30");
        }


    }
}
