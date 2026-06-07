package practice.level9;

import java.util.Scanner;

public class task12 {
   public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название продукта:");

        String productName = sc.nextLine();

        if(productName.charAt(0)=='E') {
            String cut = productName.substring(0, 3);
            System.out.println(cut);
        } else {
            System.out.println("Первая буква не E");
        }
    }
}
