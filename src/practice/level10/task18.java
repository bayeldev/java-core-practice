package practice.level10;

public class task18 {
    public static void main(String[] args) {
        String droneCommand = "pause";

        String droneStatusMessage = switch (droneCommand) {
          case "start" -> "Запуск!";
          case "stop" -> "Остановка!";
          case "pause" -> "Пауза...";
            default -> "Неизвестная команда";

        };
        System.out.println(droneStatusMessage);
    }
}
