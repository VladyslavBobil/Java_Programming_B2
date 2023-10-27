package day26_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.frequencyOfCharacters("apple" , 'p'));
        System.out.println(StringUtil.fixFormat("MicKey"));
        System.out.println(StringUtil.reverse("Loopcamp"));
        System.out.println(StringUtil.isPalindrome("racecar"));
        System.out.println(StringUtil.isPalindrome("loop"));
    }
}
