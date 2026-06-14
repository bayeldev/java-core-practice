package practice.level15;

public class task09 {
    public static void main(String[] args) {
        NewProduct product = new NewProduct("Старый товар");
        product.setProductName("Новый товар");

        System.out.println(product.getProductName());
    }
}

class NewProduct {
    private String productName;

    NewProduct(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newName) {
        this.productName = newName;
    }
}
