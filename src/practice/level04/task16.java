package practice.level04;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        while (true) {
            System.out.println("Введите сумму продажи (или отрицательное число для завершения):");


            int Sale = sc.nextInt();

            if(Sale<0) {

                break;
            }
            sum+=Sale;
        }
        System.out.println("Итоговая сумма всех продаж: " + sum);

    }
}
