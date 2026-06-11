package practice.level12;

import java.util.ArrayList;

public class task02 {
   public static void main(String[] args) {
       ArrayList<String> gros = new ArrayList<>();
       gros.add("Яблоко");
       gros.add("Банан");
       gros.add("Апельсин");

       gros.set(1, "Груша");
       gros.remove(0);

       for(String copy:gros) {
           System.out.println(copy);
       }
    }
}
