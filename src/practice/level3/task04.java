package practice.level3;

public class task04 {
    public static void main(String[] args) {
        int currentHour = 20;
        if(currentHour<12) {
            System.out.println("Доброе утро!");
        } else if(currentHour >= 12 && currentHour<=18) {
            System.out.println("Добрый день!");
        } else {
            System.out.printf("Добрый вечер!");
        }
    }

}
