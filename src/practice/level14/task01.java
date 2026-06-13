package practice.level14;

public class task01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Haski";
        dog1.age = 10;
        dog1.sayHello();
    }
}

class Dog {
    String name;
    int age;

        void sayHello () {
            System.out.println("Hello "+name);
        }
}
