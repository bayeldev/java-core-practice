package practice.level14;

public class task15 {
    public static void main(String[] args) {
    carFabric fullCar  = new carFabric("MersedesBenz", "w210", 1995);
    carFabric partCar = new carFabric("Toyota", "Camry");
    carFabric nounCar = new carFabric();

    fullCar.printCar();
    partCar.printCar();
    nounCar.printCar();


    }


}

class carFabric {
    String carBrand;
    String carModel;
    int productionYear;

    carFabric(String carBrand, String carModel, int productionYear) {
        this.carBrand=carBrand;
        this.carModel=carModel;
        this.productionYear=productionYear;
    }

    carFabric(String carBrand, String carModel) {
        this(carBrand, carModel, 2024);
    }

    carFabric() {
        this("Unknown", "Unknown");
    }



    void printCar() {
        System.out.println(carBrand + " " + carModel + " " + productionYear);
    }

}
