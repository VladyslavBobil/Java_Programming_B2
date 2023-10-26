package day25_methods;

public class VoidVsReturn {
    public static void hello (){
        System.out.println("Hello");
    }
    public static String bye (){
        return "Bye";
    }

    public static void main(String[] args) {
        hello();
        System.out.println(bye());
    }
}
