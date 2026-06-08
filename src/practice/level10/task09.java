package practice.level10;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день");
                break;

        }
    }
}
