package practice.level13;

import java.time.LocalDate;
import java.time.Period;

public class task20 {
    public static void main(String[] args) {
        LocalDate constructionDate = LocalDate.of(2000, 3, 20);
        LocalDate today = LocalDate.now();

        Period buildingAgePeriod = Period.between(constructionDate, today);
        System.out.println("Возраст: "
                + buildingAgePeriod.getYears() + " лет, "
                + buildingAgePeriod.getMonths() + " месяцев, "
                + buildingAgePeriod.getDays() + " дней");


    }
}
