package day31_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone X");
        System.out.println(phone1);
        Phone phone2 = new Phone("IPhone 14" , "Apple");
        System.out.println(phone2);
        Phone phone3 = new Phone("IPhone 14 proMax","Apple",128);
        System.out.println(phone3);
        Phone phone4 = new Phone("IPhone 15","Apple", 256 , 2.0);
        System.out.println(phone4);

    }
}
