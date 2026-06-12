package practice.level13;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class task09 {
    public static void main(String[] args) {
//        ZonedDateTime noww = ZonedDateTime.now();
//        Instant now = Instant.now();
//        System.out.println(now);
//        System.out.println(noww);
          ZonedDateTime bishkek = ZonedDateTime.now(ZoneId.of("Asia/Bishkek"));
          ZonedDateTime minsk = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
          ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
          ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Бишкек: "+bishkek.format(formatter));
        System.out.println("Минск: "+minsk.format(formatter));
        System.out.println("Сша: "+usa.format(formatter));
        System.out.println("Токио: "+tokyo.format(formatter));
    }
}
