package practice.level3;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean weWon = a>b;

        System.out.println(weWon);
    }

}
