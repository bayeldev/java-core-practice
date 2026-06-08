package practice.level10;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду (start, stop, exit):");
        String command = sc.nextLine().trim();

        switch (command) {
            case "start":
                System.out.println("Запуск!");
                break;
            case "stop":
                System.out.println("Остановка");
                break;
            case "exit":
                System.out.println("Выход");
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }

    }
}