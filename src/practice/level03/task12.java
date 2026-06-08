package practice.level03;

import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomTemperature = sc.nextInt();
        boolean isComfortable = roomTemperature >= 20 && roomTemperature <=25;
        System.out.println("isComfortable: " + isComfortable);
     }

}
