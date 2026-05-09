package practice.level4;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input = "";
        while(!"java".equals(input)) {
            input =sc.nextLine();
        }

        System.out.printf("Смартфон разблокирован!");
    }

}
