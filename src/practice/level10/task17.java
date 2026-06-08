package practice.level10;

public class task17 {
    public static void main(String[] args) {
        int httpStatusCode=200;

        String wrong = switch (httpStatusCode) {
            case 200 -> "OK";
            case 400, 404 -> "Ошибка клиента";
            case 500 -> "Ошибка сервера";
            default -> "Неизвестный код";

        };
        System.out.println(wrong);
    }
}
