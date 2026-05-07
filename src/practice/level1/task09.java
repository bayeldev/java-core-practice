package practice.level1;


public class task09 {
    public static void main(String[] args)
    {

        int itemPrice = 4;
        int itemCount = 3;
        int discount = 2;


        int totalCost = itemPrice * itemCount - discount;


        String finalMessage = "Итоговая стоимость: " + totalCost;


        System.out.println(finalMessage);
    }
}