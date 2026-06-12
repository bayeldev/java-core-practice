package practice.level13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class task11 {
    public static void main(String[] args) {
        LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18,0);

        ZoneId minsk = ZoneId.of("Europe/Minsk");

        ZonedDateTime teleportTimeMinskZoned = teleportScheduledLocal.atZone(minsk);

        ZoneId newYork = ZoneId.of("America/New_York");

        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeMinskZoned.withZoneSameInstant(newYork);

        System.out.println(teleportTimeMinskZoned);
        System.out.println(teleportTimeNewYorkZoned);
    }
}
