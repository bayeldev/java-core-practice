package practice.level03;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int currentTemperature=-5;
        if (currentTemperature<0) {
            System.out.println("Оденьтесь потеплее, на улице мороз!");

        } else {
            System.out.println("Можно идти в легкой одежде!");
        }
    }

}
