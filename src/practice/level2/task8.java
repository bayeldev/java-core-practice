package practice.level2;

public class task8 {
    public static void main(String[] args) {
        String cityName = "  Minsk  ";
        System.out.println(cityName.length());
        cityName = cityName.trim();
        System.out.println(cityName.length());

        System.out.println(cityName.toUpperCase());

        System.out.println(cityName.toLowerCase());
    }
}
