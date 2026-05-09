package practice.level4;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pass;

        do {
            System.out.println("Введите пароль: ");
            pass=sc.nextLine();

        } while (pass.length()<6);

        System.out.println("Пароль надёжен, аккаунт создан!");
    }
}
