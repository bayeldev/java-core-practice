package practice.level7;

public class task15 {
    static void main(String[] args) {
        int[][] miniGameScores =    {
                {1,2},
                {3,4,5},
                {6}
        };
        int sum=0;

        for(int[] i:miniGameScores) {
            for(int j:i) {

                sum+=j;
            }

        }
        System.out.println(sum);
    }
}
