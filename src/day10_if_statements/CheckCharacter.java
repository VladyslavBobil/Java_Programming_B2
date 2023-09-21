package day10_if_statements;

import java.sql.SQLOutput;

public class CheckCharacter {
     /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
     */
     public static void main(String[] args) {
     char letter = 'H';
     if ( 'A' <= letter && letter <= 'Z')
     {
         System.out.println("Uppercase");
     }
     if ('a' <= letter && letter <= 'z')
     {
         System.out.println("lowercase");
     }
     }
}



