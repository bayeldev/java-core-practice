package practice.level13;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class task12 {
    public static void main(String[] args) {
        ZoneId minsk = ZoneId.of("Europe/Minsk");
        ZonedDateTime originalEventTime = ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, minsk);

        Instant universalInstant = originalEventTime.toInstant();
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime eventTimeTokyoZoned = universalInstant.atZone(tokyo);

        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);
    }
}
