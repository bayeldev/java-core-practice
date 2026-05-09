package practice.level4;

import java.util.Scanner;



public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double coffee = sc.nextDouble();
//        sum+=coffee;
        while(coffee>=0) {
            sum+=coffee;
            coffee = sc.nextDouble();

        }
        int sum2=(int) sum;
        System.out.println(sum2);
    }
}
