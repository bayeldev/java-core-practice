package practice.level13;

import java.time.LocalDateTime;

public class task08 {
    public static void main(String[] args) {
        LocalDateTime missionBriefing = LocalDateTime.of(2025, 6, 1,14,0);

        LocalDateTime finalMissionTime = missionBriefing.plusHours(2).minusMinutes(30);

        System.out.println(finalMissionTime);
    }
}
