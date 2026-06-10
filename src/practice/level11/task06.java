package practice.level11;

public class task06 {
    public static void main(String[] args) {
        int[] heroInventory = {101, 102, 103};

        try {
            int temp = heroInventory[10];
            System.out.println(temp);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");
        }
    }
}
