package practice.level3;


import java.util.Scanner;
public class task07 {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int age = sc.nextInt();
         sc.nextLine();

         String key = sc.nextLine();

         if(age>=21){
                if(key.equals("VIP")) {
                System.out.println("Доступ к VIP-залу разрешен.");
                }  else if(key.equals("GUEST")) {
                    System.out.println("Гостевой доступ разрешен.");
                }    else {
                    System.out.println("Неверный код приглашения.");
                }

         }   else {
             System.out.println("К сожалению, только с 21 года.");
         }



     }




}
