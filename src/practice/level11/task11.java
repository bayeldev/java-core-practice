package practice.level11;

public class task11 {
    public static void main(String[] args) {
        try {
            int res = 5/0;
            System.out.println(res);
        } finally {
            System.out.println("Датчик сообщает: Работа finally завершена. Даже в случае аварии.");
        }

        System.out.println("Проверка");
    }
}
