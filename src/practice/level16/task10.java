package practice.level16;

public class task10 {

    interface Communicator {
        void greet();

    }

    public static void main(String[] args) {
        Communicator first = new Communicator() {
            @Override
            public void greet() {
                System.out.println("Привет, мир!");
            }
        };

        first.greet();
    }
}
