package practice.level5;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите волшебное послание:");
        String magicMessage=sc.nextLine();

        String reversed="";
        for(int i=magicMessage.length()-1;i>=0;i--) {
                reversed+=magicMessage.charAt(i);
        }
        System.out.println(reversed);
    }
}
