package practice.level5;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretKeyCandidate = sc.nextInt();

        // числа <= 1 не являются простыми
        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        // проверяем делители от 2 до sqrt(n)
        for (int i = 2; i <= secretKeyCandidate / i; i++) {

            if (secretKeyCandidate % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}