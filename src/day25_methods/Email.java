package day25_methods;

import java.util.Scanner;

/*
    Crate a method that accepts two parameters,
    and generate and email from that.
        Full Name , domain (gmail.com , hotmail.com, ..... )
        Input :  Tom Jerry , gmail

        Output : tjerry@gmail.com
 */
public class Email {
    public static void main(String[] args) {

      String fullName = "Winnie Pooh";
      String domain = "gMail";

      generateEmail(fullName , domain);
      generateEmail("Vladyslav Bobil" , "yahoo");


    }

    public static void generateEmail (String fullName, String domain ){

        String email = "" + fullName.charAt(0) + fullName.substring(fullName.indexOf(" ")+1) + "@" + domain + ".com";
        System.out.println(email.toLowerCase());

    }

}
