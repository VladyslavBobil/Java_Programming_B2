package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    /*
        create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other
     */
    public static void main(String[] args) {
        Scanner imput  = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = imput.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = imput.nextInt();

        System.out.println("Numbers are equal ? " + (num1 == num2));
    }
}
