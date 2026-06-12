package practice.level13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task14 {
    public static void main(String[] args) {
        String inputDateString = "2024-12-31";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate date = LocalDate.parse(inputDateString, formatter);
        System.out.println(date);
    }
}
