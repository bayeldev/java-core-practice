package practice.level4;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu;

        do {
            System.out.println("1. Вывести приветствие" + "\n" + "2. Выйти");
            menu=sc.nextInt();
            if(menu==1) {
                System.out.println("Привет!");
            }
        } while (menu!=2);
    }
}
