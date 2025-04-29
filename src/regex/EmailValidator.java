package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@email.com";
        String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
//^[\\w.-]+ → Start with word characters (letters, digits, _), dots, or hyphens
// @ → Must include "@"
// [\\w.-]+ → Domain name part
//\\.[a-zA-Z]{2,6}$ → Top-level domain (e.g., .com, .org)
        //compile is static method throws PatternSyntaxException
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address.");
        }

    }
}
