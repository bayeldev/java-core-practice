package practice.level16;

public class task02 {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        Person.Greeting hello = anna.new Greeting();

        hello.sayHello();
    }

}

class Person {
    private String userName;

    Person(String userName) {
        this.userName=userName;
    }


    class Greeting{
        void sayHello() {
            System.out.println("Hello, "+userName);
        }

    }
}
