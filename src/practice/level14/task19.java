package practice.level14;

public class task19 {
    public static void main(String[] args) {
        CarX newCar = new CarX();
//        System.out.println(newCar.carModel);
    }
}

class CarX {
    String carModel = "Неизвестно";

    {
        System.out.println("Создаётся объект Car, model = " + carModel);
    }

}
