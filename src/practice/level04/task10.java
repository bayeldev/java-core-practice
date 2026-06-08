package practice.level04;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passPIN;
        do {
            System.out.println("Введите PIN-код:");
            passPIN=sc.nextInt();


        } while (passPIN<1000 || passPIN>9999);

        System.out.println("PIN-код принят");
    }
}
