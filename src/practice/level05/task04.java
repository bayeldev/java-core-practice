package practice.level05;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите число N (magicLimit):");
        int magicLimit = sc.nextInt();

        for(int i=1;i<=magicLimit;i++) {
            System.out.println(i*i);
        }
    }
}
