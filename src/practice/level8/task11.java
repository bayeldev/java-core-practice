package practice.level8;

public class task11 {
    public static int getHigherScore (int playerOneScore, int playerTwoScore) {
        if(playerOneScore>playerTwoScore) {
            return playerOneScore;
        } else  {
            return playerTwoScore;
        }

    }

    public static void main(String[] args) {
        int playerOneScore = 10, playerTwoScore = 25;

        int championsScore = getHigherScore(playerOneScore, playerTwoScore);

        System.out.println("Наивысший балл: " + championsScore);
    }
}
