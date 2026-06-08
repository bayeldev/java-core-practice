package practice.level03;

import java.util.Scanner;


public class task05 {

    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите секретный код:");
        String secretCode=sc.nextLine();

        if(age>=18) {

            if(secretCode.equals("OPEN")) {
                System.out.println("Вход разрешен!");
            } else {
                System.out.println("Вам сегодня не повезло, вход запрещен.");
            }


        } else {
            System.out.println("Вам сегодня не повезло, вход запрещен.");
        }

    }



}
