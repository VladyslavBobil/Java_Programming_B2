package day25_methods;

public class MyMathClass {

    public static void add ( int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    public static void subtract ( int num1 , int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    public static void multiply ( int num1 , int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    public static void divide ( int num1 , int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void main(String[] args) {
        add (5,4);
        subtract(9,3);
        multiply(10 , 9);
        divide(49 , 7 );
    }
}
