package practice.level07;

public class task09 {
    public static void main(String[] args) {
        int[][] theaterSeating = new int[2][3];

        int value =1;
        for(int i = 0;i<2;i++) {
            for(int j=0;j<3;j++) {
                theaterSeating[i][j]=value;
                value++;
            }
        }
        System.out.println(theaterSeating[1][0]);
    }
}
