package practice.level08;

public class task13 {
    public static void resetRobotStart (int[] trajectoryPath) {
        trajectoryPath[0] = 0;

    }

    public static void main(String[] args) {
        int[] initialPath = {3, 4, 5};
        resetRobotStart(initialPath);

        System.out.println(initialPath[0]);
    }
}
