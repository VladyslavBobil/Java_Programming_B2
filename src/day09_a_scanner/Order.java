package day09_a_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a product name : ");
        String productName = key.nextLine();

        System.out.println("Enter the price for a " + productName + ": ");
        double price = key.nextDouble();

        System.out.println("How many " + productName + " do yuo want to buy? ");
        int quantity = key.nextInt();

        key.nextLine();
        System.out.println("What we should put in your order ?");
        String orderName = key.nextLine();

        double total = price * quantity;

        System.out.println(orderName + ", your order for " + quantity + " " + productName + " has been placed your total is : $" + total );

    }
}

