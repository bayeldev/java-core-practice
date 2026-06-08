package practice.level03;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       boolean isSunny=true, isWeekend = false;

       boolean canGoToPark = isSunny && isWeekend;
       boolean canStayHome=!isSunny || !isWeekend;

        System.out.println("canGoToPark = " + canGoToPark);
        System.out.println("canStayHome = " + canStayHome);

    }

}
