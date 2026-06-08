package practice.level08;

public class task06 {
    public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {

        int sum = firstItemPrice+secondItemPrice;
        System.out.println("Общая стоимость покупки: " + sum);

    }

    public static void main(String[] args) {
        calculateAndShowCost(75, 170);
    }
}
