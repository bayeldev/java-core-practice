package practice.level12;

import java.util.ArrayList;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<>();


        while (true) {
            System.out.println("Введите список задач " + "\n" + "Если хотите выйти введите пустую строку");
            String task = sc.nextLine();
            if(task.isEmpty()) {
                break;
            } else {
                todo.add(task);
            }
        }
        System.out.println("Ваш список дел:");
        for(int i = todo.size()-1;i>=0;i--) {

            System.out.println(todo.get(i));
        }
    }
}
