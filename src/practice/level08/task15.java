package practice.level08;

public class task15 {

    public static void swapPlayerNumbers(int[] teamLineup) {
        int temp = teamLineup[0];
        teamLineup[0]=teamLineup[1];
        teamLineup[1] = temp;
    }



    public static void main(String[] args) {
        int[] playerSquad = {7, 9};
        swapPlayerNumbers(playerSquad);
        System.out.print(playerSquad[0] + " " +playerSquad[1]);
    }
}
