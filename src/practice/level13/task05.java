package practice.level13;

import java.time.LocalTime;


public class task05 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int displaysHours = currentTime.getHour();
        int displayMinutes = currentTime.getMinute();
        int displaySeconds = currentTime.getSecond();

        System.out.printf("Часы: %d, минуты: %d, секунды: %d", displaysHours,  displayMinutes, displaySeconds);
    }
}
