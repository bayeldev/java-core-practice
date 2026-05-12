package practice.level5;
import java.util.Random;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        // Случайное начальное число камней 1..100
        Random rand = new Random();
        int stones = rand.nextInt(100) + 1;

        // Подготовка ввода
        Scanner sc = new Scanner(System.in);
        System.out.println("Старт игры. В куче " + stones + " камней.");


        while (stones > 0) {

            int maxTake = Math.min(10, stones);
            int takePlayer;
            while (true) {
                System.out.print("Сколько камней возьмёте (1-" + maxTake + "): ");
                takePlayer = sc.nextInt();
                if (takePlayer >= 1 && takePlayer <= maxTake) break;
                System.out.println("Неверный ввод.");
            }
            stones -= takePlayer;
            System.out.println("Игрок взял " + takePlayer + ". Осталось: " + stones);
            if (stones == 0) {
                System.out.println("Игрок победил!");
                break;
            }


            int takeBot = Math.min(stones, rand.nextInt(10) + 1);
            stones -= takeBot;
            System.out.println("Компьютер взял " + takeBot + ". Осталось: " + stones);
            if (stones == 0) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
    }
}