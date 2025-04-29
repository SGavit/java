package java_8.predicate;

import java.util.function.Predicate;

public class StrContainOnlyAlpha {
    public static void main(String[] args) {
      
        //Lambda to check if a string contains only alphabets 
        Predicate<String> isAlphabetOnly = str -> 
                                           str!=null &&
                                           str.matches("[a-zA-Z]+");
        //Test Example
        String test1 = "Shalim";
        String test2 = "Shalim123";
        String test3 = "Shalim@";

        System.out.println(test1 +"=>"+isAlphabetOnly.test(test1));
        System.out.println(test2 +"=>"+isAlphabetOnly.test(test2));
        System.out.println(test3 +"=>"+isAlphabetOnly.test(test3));


    }
}
