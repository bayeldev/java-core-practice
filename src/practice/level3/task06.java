package practice.level3;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();

        String city = sc.nextLine();

        if(age>=21) {
            if(city.equals("Минск")) {
                System.out.println("Добро пожаловать в клуб, Минск!");
            }
            else{
                System.out.println("Извините, вход запрещен.");
            }
        } else {
            System.out.println("Извините, вход запрещен.");
        }


    }
}
