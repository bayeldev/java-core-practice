package practice.level6;

import java.util.Locale;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите сумму платежа: ");
        double customerPayment =  sc.nextDouble();
        System.out.println("Внесено средств: "+customerPayment);
    }
}
