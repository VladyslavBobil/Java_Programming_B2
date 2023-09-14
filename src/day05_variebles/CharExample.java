package day05_variebles;

public class CharExample {
    public static void main (String [ ] args){
        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // It will calculate numbers of a and Z from ASCII Table



        char letterTree = 65 ;

        System.out.println(letterTree);
        System.out.println(letterOne + letterTwo + letterTree + numberOne + specialOne);
        System.out.println(letterOne + " " + letterTwo + " " +  letterTree + " " + numberOne + " " + specialOne);

        // Concatenation
        System.out.println("Chars: " + letterOne + letterTwo + letterTree + numberOne + specialOne);

        // Concatenation starts from first string , anything after first string is concatenated
        System.out.println(letterOne + letterTwo + "Chars : " +letterTree + numberOne + specialOne);



        // assign characters to the char dataType
    }
 }
