package polygon;

public class Inheritance {
    static void main() {
        Dog dog = new Dog();
        dog.say();
        dog.sleep();
    }
}
class Animal {
    String name;

    void say() {
        System.out.println("Животное говорит");
    }

    void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    @Override
    void say() {

        System.out.println("Собака говорит");
    }
}
