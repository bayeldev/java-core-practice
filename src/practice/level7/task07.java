package practice.level7;

public class task07 {
    public static void main(String[] args) {
        int[] itemPrices = {5, 7, 2, 9};
        int sum=0;

        for(int price:itemPrices) {
            sum+=price;

        }
        System.out.println(sum);

    }
}
