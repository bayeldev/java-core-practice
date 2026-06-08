package practice.level07;

public class task04 {
    public static void main(String[] args) {
        int[] roundScores = new int[10];

        for(int i = 0; i<roundScores.length;i++) {
            roundScores[i] = i+1;
        }

        for(int i=0;i<roundScores.length;i++) {
            System.out.print(roundScores[i] + " ");
        }

    }
}
