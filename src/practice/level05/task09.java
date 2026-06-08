package practice.level05;

import java.util.Random;
import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Random rand = new Random();
        int secret = rand.nextInt(100)+1;
        int count = 0;

        while(true) {
            int num = sc.nextInt();

            if(num<secret) {
                System.out.println("Больше!");
            } else if(num>secret) {
                System.out.println("Меньше!");
            } else if (num==secret)   {
                System.out.println("Верно!");
                break;
            }
            count++;
        }
            System.out.println("Вы потратили "+ count +" попыток");
    }
}
