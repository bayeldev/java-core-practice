package polygon;

import java.util.Scanner;

public class Caffe {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int Pepperoni = 1, allMeat=2, fourCheese=3;
        System.out.println("Welcome to Dodo Pizza!");
        System.out.println("Please select a pizza");
        System.out.println("1. Pepperoni");
        System.out.println("2. All Meat");
        System.out.println("3. Four Cheese");
        System.out.println();
        int сustomer = sc.nextInt();


        if(сustomer ==Pepperoni) {
            selectedPepperoni();
            orderPizza();
            pepperoniPizza();
            sayThank();
        } else if(сustomer ==allMeat) {
            selectedAllMeat();
            orderPizza();
            allMeatPizza();
            sayThank();
        } else if(сustomer ==fourCheese) {
            selectedFourCheese();
            orderPizza();
            fourCheese();
            sayThank();
        } else {
            System.out.println("Please select a Pizza");
        }


    }
    public static void selectedFourCheese() {
        System.out.println("You chose FourCheese pizza");
        System.out.println();
    }

    public static void selectedAllMeat() {
        System.out.println("You chose All Meat pizza");
        System.out.println();
    }

    public static void selectedPepperoni () {
        System.out.println("You chose Pepperoni pizza");
        System.out.println();
    }

    public static void pepperoniPizza () {

        System.out.println("Your Pepperoni pizza is ready! ");
        System.out.println();

    }

    public static void allMeatPizza() {

        System.out.println("Your AllMeat pizza is ready! ");
        System.out.println();
    }

    public static void fourCheese() {
        System.out.println("Your fourCheese pizza is ready!");
        System.out.println();
    }

    public static void orderPizza() {
        System.out.println("Your order is being processed");
        System.out.println("Please wait 15 minutes");
        System.out.println();
    }


    public static void sayThank() {
        System.out.println("Thank you for visiting us!");
    }
}
