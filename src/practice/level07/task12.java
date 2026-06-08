package practice.level07;

public class task12 {
    public static void main(String[] args) {
        int[][] sensorData = new int[2][5];
        int val=10;

        for(int i =0;i<2;i++) {
            for(int j=0;j<5;j++) {
                sensorData[i][j]+=val;
                val++;
            }

        }
        for (int i=0;i<sensorData.length;i++) {
            for(int j=0;j<sensorData[i].length;j++) {
                if(sensorData[i][j]!=sensorData[i][4]) {
                System.out.print(sensorData[i][j]+" ");

                } else {
                    System.out.print(sensorData[i][j]);
                    break;
                }
            }
            System.out.println();

        }

    }
}
