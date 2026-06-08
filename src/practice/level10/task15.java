package practice.level10;

public class task15 {
    public static void main(String[] args) {
        for(DayOfWeek day: DayOfWeek.values()) {
            System.out.println(day);
        }

    }
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
