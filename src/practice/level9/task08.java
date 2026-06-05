package practice.level9;

import java.util.Locale;

public class task08 {
    public static void main(String[] args) {
        String studentName = "Анна";
        int correctAnswers = 45;
        int totalQuestions = 50;

        double percent = (double) correctAnswers / totalQuestions * 100;

        String res = String.format(Locale.GERMANY, "%s: %.1f%% правильных ответов", studentName, percent);

        System.out.println(res);


    }
}
