package practice.level13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task13 {
    public static void main(String[] args) {
        LocalDate currentReportDate = LocalDate.now();
        String formattedReportDat = currentReportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(formattedReportDat);
    }
}
