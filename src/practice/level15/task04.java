package practice.level15;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id товара: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите название товара: ");

        String name =sc.nextLine();
        Product newProd = new Product(id, name);

        System.out.println("ID Товара: "+newProd.getProductID());
        System.out.println("Название товара: " + newProd.getProductName());
    }
}

class Product {
    private int productID;
    private String productName;


    Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public int getProductID() {
        return  productID;
    }

    public String getProductName() {
        return  productName;

    }



}
