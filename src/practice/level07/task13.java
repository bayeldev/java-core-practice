package practice.level07;

public class task13 {
    public static void main(String[] args) {
        int[][] playerAchievements = new int[3][];
        playerAchievements[0] = new int[] {10, 20};
        playerAchievements[1] = new int[] {100,200,300,400};
        playerAchievements[2] = new int[] {1000};

        for(int i = 0; i < playerAchievements.length; i++) {
            for(int j = 0; j< playerAchievements[i].length; j++) {
                if(j>0) {
                    System.out.print(" ");
                }

                System.out.print(playerAchievements[i][j]);

            }
            System.out.println();
        }
    }
}
