package practice.level15;

public class task06 {
    public static void main(String[] args) {
        MagicalCalculator calc = new MagicalCalculator();

        int sum = calc.addNumbers(66, 77);

        System.out.println(sum);

        
    }
}
class MagicalCalculator {
    public int addNumbers(int a, int b) {
        return a+b;
    }

    private void displayInternalResult(int calculationResult) {
        System.out.println("Внутренний результат: " + calculationResult);
    }
}