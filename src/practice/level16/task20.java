package practice.level16;

public class task20 {

    public static class DevUtils{
        public static <T> void printTwice(T value) {
            System.out.println(value);
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        DevUtils.printTwice(200);
        DevUtils.printTwice("Aru");
    }

}

