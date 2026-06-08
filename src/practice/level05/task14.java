package practice.level05;

// Импортируем класс java.util.Date
import java.util.Date;

public class task14 {
    public static void main(String[] args) {

        Date utilDate = new Date();


        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());


        System.out.println("java.util.Date: " + utilDate);
        System.out.println("java.sql.Date: " + sqlDate);
    }
}