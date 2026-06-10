package practice.level11;

public class task10 {
    public static void displayPositiveScore (int currentScore) {
        if (currentScore>0) {
            System.out.println(currentScore);
        } else if (currentScore<=0) {
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }
    }

    public static void main(String[] args) {
        displayPositiveScore(50);


        try {
            displayPositiveScore(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
