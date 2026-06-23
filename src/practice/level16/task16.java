package practice.level16;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name = sc.nextLine();
        new TextAnalyzer().generateNameReport(name);
    }
}

class TextAnalyzer {
    public void generateNameReport (String customerName) {
        class NameStatistics {
            private  String originalCustomerName;

            NameStatistics(String customerName) {
                this.originalCustomerName = customerName;
            }

            void printUpperCase() {
                System.out.println(originalCustomerName.toUpperCase());
            }
            void printNameLength() {
                System.out.println(originalCustomerName.length());
            }
        }

        NameStatistics first = new NameStatistics(customerName);
        first.printUpperCase();
        first.printNameLength();
    }
}
