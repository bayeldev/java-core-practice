package practice.level6;

import java.text.DecimalFormat;

public class task15 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double quarterlyRevenue = 312.4;
        System.out.println(df.format(quarterlyRevenue));
    }
}
