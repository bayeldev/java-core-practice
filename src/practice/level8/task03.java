package practice.level8;

public class task03 {
    public class GameScore {
        private static int totalGameScore=0;

        public static void collectCoin() {
            totalGameScore++;

        }
        public static void displayCurrentScore() {
            System.out.println(totalGameScore);
        }
    }

    public static void main(String[] args) {
        GameScore.collectCoin();
        GameScore.collectCoin();
        GameScore.collectCoin();

        GameScore.displayCurrentScore();

    }
}
