package practice.level11;

public class task08 {
    public static void main(String[] args) {
        int primaryValue = 10;
        int secondaryValue = 0;

        try {
            int temp = primaryValue/secondaryValue;
            System.out.println(temp);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления. Продолжаем работу системы.");
        }
        System.out.println("Миссия завершена. Программа завершена.");
    }
}
