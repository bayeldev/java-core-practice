package practice.level12;

import java.util.ArrayList;

public class task03 {
   public static void main(String[] args) {
       ArrayList<String> todo = new ArrayList<>();

       todo.add("Анна");
       todo.add("Иван");
       todo.add("Петр");
       todo.add("Мария");

       System.out.println(todo.contains("Петр"));
       System.out.println(todo.contains("Сергей"));
    }
}
