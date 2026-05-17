package practice.level6;

public class task20 {
    public static void main(String[] args) {
        int quizScore = 4;
        double projectScore = 2.7;

        double exactCourseAverage = (quizScore + projectScore) / 2;
        int roundedCourseAverage = (int) exactCourseAverage;
        System.out.println(exactCourseAverage);
        System.out.println(roundedCourseAverage);
    }
}
