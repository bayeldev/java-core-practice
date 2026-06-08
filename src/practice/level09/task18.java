package practice.level09;

public class task18 {
    public static void main(String[] args) {
        StringBuilder sent = new StringBuilder("Привет, мир!");

        int index = sent.indexOf(",");

        sent.insert(index+2, "Java ");

        System.out.println(sent);
    }
}
