package practice.level5;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ladderHeight =sc.nextInt();
        for(int i=1;i<=ladderHeight;i++) {

            for(int j=0;j<i;j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

}



