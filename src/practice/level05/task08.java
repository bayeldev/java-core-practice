package practice.level05;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pathOne= sc.nextInt(), pathTwo = sc.nextInt(), pathThree= sc.nextInt();

        if(pathOne<=pathTwo && pathOne<=pathThree) {
            System.out.println(pathOne);
        } else if(pathTwo<=pathOne && pathTwo<=pathThree) {
            System.out.println(pathTwo);
        } else {
            System.out.println(pathThree);
        }
    }
}
