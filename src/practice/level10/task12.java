package practice.level10;

import java.util.Scanner;

public class task12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе целое число:");
        int b = sc.nextInt();

        System.out.println("Введите операцию (+, -, *, /):");
        char op = sc.next().charAt(0);

        int result=0;

        switch (op) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            default:
                System.out.println("Неизвестная операция");
                return;




        }


        System.out.println(result);
    }
}
