package practice.level11;

public class task09 {
    public static void main(String[] args) {

        try {
            int tasks=10;
            int time=2;
            int allTime = tasks/time;
            System.out.println("Время выполнение уборки: " + allTime);
        } finally {
            System.out.println("Робот завершил свою работу. Выполнение завершено.");
        }
    }
}
