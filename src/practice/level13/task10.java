package practice.level13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class task10 {
    public static void main (String[] args) {
        LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 6, 1, 14,0);

        ZoneId minskZone = ZoneId.of("Europe/Minsk");
        ZonedDateTime conferenceStartMinskZoned = conferenceStartLocal.atZone(minskZone);

        System.out.println(conferenceStartMinskZoned);

    }
}
