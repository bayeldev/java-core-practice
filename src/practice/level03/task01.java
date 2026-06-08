package practice.level03;

import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int visitorAge = 17;


        if (visitorAge < 18) {

            System.out.println("Доступ запрещен");
        } else {

            System.out.println("Добро пожаловать!");
        }
    }
}