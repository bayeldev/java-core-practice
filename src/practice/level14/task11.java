package practice.level14;

public class task11 {
    public static void main(String[] args) {
        carMarket firstCar = new carMarket();
        carMarket secondCar = new carMarket();

        firstCar.carBrand = "Toyota";
        firstCar.carYear = 2023;

        secondCar.carBrand = "BMW";
        secondCar.carYear = 2001;

        System.out.printf("Марка: %s, год выпуска: %d\n", firstCar.carBrand, firstCar.carYear);

        System.out.printf("Марка: %s, год выпуска: %d\n", secondCar.carBrand, secondCar.carYear);


    }
}

class carMarket {
    String  carBrand;
    int carYear;

}
