package practice.level09;

import java.util.Scanner;

public class task10 {

   public  static void main() {
       Scanner sc = new Scanner(System.in);

        String phrase = sc.nextLine();
        int dlina = phrase.length();

        int java = phrase.indexOf("Java");
       System.out.println(phrase.substring(java, java+4));
       System.out.println(java);
       System.out.println(dlina);


    }
}
