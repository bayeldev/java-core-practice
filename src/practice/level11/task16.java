package practice.level11;

public class task16 {
    public static int convertToGoldAmount(String playerInput) throws NumberFormatException {
        return Integer.parseInt(playerInput);

    }

    public static void main(String[] args) {
        try {
          int goldAmount =  convertToGoldAmount("десять золота");
            System.out.println("Количество золота: "+goldAmount);

        } catch (NumberFormatException e) {
            System.out.println("Игрок ввел неверное значение. Ошибка преобразования числа.");
        }
    }

}
