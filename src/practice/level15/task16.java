package practice.level15;

public class task16 {
    public static void main(String[] args) {
        System.out.println(GlobalConstants.MATH_PI);
        System.out.println(GlobalConstants.CALENDAR_DAYS_IN_YEAR);
    }
}
class GlobalConstants {
    public static final double MATH_PI = 3.14159;
    public static final int CALENDAR_DAYS_IN_YEAR=365;

    private GlobalConstants() {

    }
}