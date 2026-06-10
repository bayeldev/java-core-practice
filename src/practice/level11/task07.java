package practice.level11;

public class task07 {
    public static void main(String[] args) {
        try {
            int x = 50/0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
