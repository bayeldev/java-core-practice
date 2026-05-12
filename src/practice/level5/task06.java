package practice.level5;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String back_s="";
        boolean isPalindrom  = true;

        for(int i =0,j=s.length()-1;i<j;i++,j--) {

            if(s.charAt(j)!=s.charAt(i)) {
                isPalindrom = false;
                break;

            }
        }

        System.out.println(isPalindrom ? "YES":"NO");

        
    }

}
