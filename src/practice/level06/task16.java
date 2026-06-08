package practice.level06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class task16 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        DecimalFormat df=new DecimalFormat("#,##0.00",symbols);


        double totalGlobalSales = 12345678.9012;
        System.out.println(df.format(totalGlobalSales));
    }

}
