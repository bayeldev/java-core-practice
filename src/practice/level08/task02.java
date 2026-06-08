package practice.level08;

public class task02 {
    public static void main(String[] args) {
        MathMagic.showSum(7, 5);
    }
}

class  MathMagic {
    public static void showSum(int firstNumber, int secondNumber) {
        int sum = firstNumber+secondNumber;
        System.out.println(sum);
    }
}
