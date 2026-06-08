package practice.level06;

public class task12 {
    public static void main(String[] args) {
        double actualFrequency = 0.1+0.2;
        double targetFrequency = 0.3;
        double tolerance = 0.000001;
        double diff = Math.abs(actualFrequency-targetFrequency);
        if(diff<tolerance) {
            System.out.println("Лазер откалиброван с допустимой точностью");
        } else {
            System.out.println("Требуется дополнительная калибровка");
        }
    }
}
