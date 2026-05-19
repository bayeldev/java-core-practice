package practice.level7;

import java.util.Arrays;

public class task19 {
    public static void main(String[] args) {
        int[] dailyTemperatures = {10,20,30,40,50,60,70};

        int[] copyDaily =  Arrays.copyOfRange(dailyTemperatures, 2, 5);
        System.out.println(Arrays.toString(copyDaily));
    }
}
