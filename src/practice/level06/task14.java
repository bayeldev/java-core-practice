package practice.level06;

public class task14 {
    public static void main(String[] args) {
        double elixirPriceWithTax = 17.34567;
        double firstMove = elixirPriceWithTax* 100;
        double secondMove = Math.round(firstMove);
        double displayPrice = secondMove/100.0;
        System.out.println(displayPrice);

    }
}
