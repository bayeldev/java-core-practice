package practice.level9;

public class task07 {
    public static void main(String[] args) {

        String itemName = "Яблоки";
        int itemCount = 7;
        double itemWeight = 1.234;


        String report = String.format(
                "Товар: [%-10s] | Кол-во: [%4d] | Вес: [%5.2f кг]",
                itemName, itemCount, itemWeight
        );


        System.out.println(report);
    }
}
