package practice.level13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task16 {
    public static void main(String[] args) {
        String orderTimestampString = "01.06.2025 14:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, formatter);
        System.out.println(parsedOrderDateTime);


    }
}
