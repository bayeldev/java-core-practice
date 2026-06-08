package practice.level10;

public class task20 {
    public static void main(String[] args) {
        int studentScore = 9;

        String finalGrade = switch (studentScore) {
          case 5, 6, 7 -> "Хорошо";
          case 8, 9, 10 -> "Отлично";
            default -> "Нужно постараться";
        };

        System.out.println(finalGrade);
    }
}
