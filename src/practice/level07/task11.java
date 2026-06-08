package practice.level07;

public class task11 {
    public static void main(String[] args) {
        int[][] warehouseInventory = new int[3][4];
        int val = 1;
        for(int i=0;i<3;i++) {
            for(int j = 0;j<4;j++) {
                warehouseInventory[i][j]+=val;
                val++;
            }
        }
        System.out.println(warehouseInventory[1][2]);
    }
}
