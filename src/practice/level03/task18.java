package practice.level03;

public class task18 {
    public static void main(String[] args) {
        int orderNumber = 7;
        String orderStatus = orderNumber%2==0 ? "Чётный" : "Нёчетный";

        System.out.println(orderStatus);
    }
}
