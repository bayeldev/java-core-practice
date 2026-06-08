package practice.level05;

public class task16 {
    public static void main(String[] args) {
        int number=1;

        while(true) {
            if(number%7==0) {
                System.out.println("Первое число, кратное 7: " + number);
                break;

            }
            number++;
        }
    }
}
