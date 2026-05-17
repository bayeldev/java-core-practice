package practice.level6;

public class task11 {
    public static void main(String[] args) {
        double mysticAnomaly = Math.sqrt(-1);
        System.out.println("Значение mysticAnomaly: " + mysticAnomaly);
        boolean isNaN = Double.isNaN(mysticAnomaly);
        System.out.println("Является ли mysticAnomaly NaN: "+ isNaN );
    }
}
