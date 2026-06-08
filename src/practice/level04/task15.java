package practice.level04;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число больше 1:");
        int n = sc.nextInt();

        boolean isPrime= true;

        for(int i=2;i<n;i++) {

            if(n%i==0) {
                System.out.println(i);
                isPrime = false;
                break;
            }

        }
        if(isPrime) {
            System.out.println("Число простое");
        }


    }

}
