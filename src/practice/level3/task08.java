package practice.level3;

import java.util.Scanner;


public class task08 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите ваш возраст:");
            int age = sc.nextInt();

            sc.nextLine();
            System.out.println("У вас есть клубная карта? (да/нет):");
            String hascard= sc.nextLine().trim().toLowerCase();

            if(age>=65) {
                System.out.println("Ваша скидка: 20%.");
            } else {
                if(hascard.equals("да")) {
                    System.out.println("Ваша скидка: 10%.");
                } else {
                    System.out.println("Скидки нет.");
                }
            }




    }




}
