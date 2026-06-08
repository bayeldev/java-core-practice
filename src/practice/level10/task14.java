package practice.level10;

public class task14 {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case SPRING:
                System.out.println("Скоро лето!");
                break;

            case SUMMER:
                System.out.println("Лето — время отпусков!");
                break;

            case AUTUMN:
                System.out.println("Скоро Новый год!");
                break;

            case WINTER:
                System.out.println("Пора кататься на лыжах!");
        }

    }

    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN

    }
}
