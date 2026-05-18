package practice.level7;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] favoriteMovies = new String[3];

        for(int i = 0; i< favoriteMovies.length; i++) {
            favoriteMovies[i] = sc.nextLine();
        }
//        int i = favoriteMovies.length-1; i>=0; i--
        for(int i = favoriteMovies.length-1; i>=0; i--) {
            System.out.println(favoriteMovies[i]);
        }
    }
}
