package practice.level16;

public class task15 {
    public static void main(String[] args) {
        SpecialCalculator calculator = new SpecialCalculator();
        calculator.calculateAndDisplaySum(14, 99);
    }
}

class SpecialCalculator {
   public void calculateAndDisplaySum(int numA, int numB) {

        class SumResultPrinter {
            void printResult() {
                System.out.println(numA+numB);
            }
        }

        SumResultPrinter printAnswer = new SumResultPrinter();
        printAnswer.printResult();
   }
}
