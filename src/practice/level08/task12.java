package practice.level08;

public class task12 {
    public static int calculateTotalGrades(int[] studentExamResults) {
        int sum=0;
        for(int i=0;i<studentExamResults.length;i++) {
            sum+=studentExamResults[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] currentGrades = {5, 4, 3, 5, 4} ;

        int finalTotalPoints = calculateTotalGrades(currentGrades);

        System.out.println("Сумма всех оценок: "+ finalTotalPoints);
    }
}
