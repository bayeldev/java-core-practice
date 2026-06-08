package practice.level08;

public class task09 {

    public static String generateGreetingMessage (String recipientName) {
        return "Привет, " + recipientName + "!";

    }
    public static void main(String[] args) {
        String greeting = generateGreetingMessage("Алиса");

        System.out.println(greeting);

    }
}
