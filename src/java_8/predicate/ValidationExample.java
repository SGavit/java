package java_8.predicate;

import java.util.function.Predicate;

public class ValidationExample {
    public static void main(String[] args) {
        Predicate<String> isValidName = name -> name != null && name.length() >= 3;
        String userInput = "John";

        if (isValidName.test(userInput)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }
}
