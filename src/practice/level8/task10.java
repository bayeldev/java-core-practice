package practice.level8;

public class task10 {
    public static boolean checkIfEven(int inputNumber) {
        return inputNumber%2==0;

    }

    public static void main(String[] args) {
        boolean isEven = checkIfEven(18);

        if(isEven) {
            System.out.println("Это число чётное!");
        }  else  {
            System.out.println("Это число нечётное!");
        }
    }
}
