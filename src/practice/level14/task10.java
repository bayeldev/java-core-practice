package practice.level14;

public class task10 {
    public static void main(String[] args) {
        myDog dog = new myDog("Rex", 7);

        System.out.printf("Собаку зовут %s, ей %d лет", dog.dogName, dog.dogAge);
    }



}

class myDog {
    String dogName;
    int dogAge;

    myDog(String dogName, int dogAge) {
        this.dogName=dogName;
        this.dogAge=dogAge;
    }
}
