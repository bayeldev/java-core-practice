package practice.level13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task15 {
    public static void main(String[] args) {
        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String friendlyDisplayDateString = specificEventDate.format(formatter);
        System.out.println(friendlyDisplayDateString);
    }
}
