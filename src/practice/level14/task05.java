package practice.level14;

public class task05 {
    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", 2019);
        firstCar.displayDetails();

    }


}

class Car {
    String carBrand;
    int productionYear;

   public Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;


    }


    void displayDetails() {
        System.out.printf("Марка: %s, год выпуска: %d", carBrand, productionYear);
        System.out.println();
    }
}
