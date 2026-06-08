package practice.level10;

public class task04 {
    public static void main(String[] args) {
        String sensorReadingText = "NaN";
        double parsedSensorData = Double.parseDouble(sensorReadingText);

        boolean isNaN = Double.isNaN(parsedSensorData);



        System.out.println(isNaN);


    }
}
