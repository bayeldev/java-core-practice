package practice.level5;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите высоту обелиска");
        int pyramidHeight = sc.nextInt();

        for(int i = 1; i <=pyramidHeight; i++) {
            int spaces = pyramidHeight - i;
            int stars = 2*i-1;

            for(int j = 0;j<spaces;j++) {
                System.out.print(" ");
            }
            for(int l =0;l<stars;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
