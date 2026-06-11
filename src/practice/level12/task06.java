package practice.level12;

import java.util.HashMap;

public class task06 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Анна", 5);

        if (studentGrades.containsKey("Анна")) {
           int grade=  studentGrades.get("Анна");
            System.out.println("Оценка Анны: " + grade);
        }
    }
}
