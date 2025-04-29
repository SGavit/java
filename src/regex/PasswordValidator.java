package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Passw0rd!";

//        What this password pattern does:
//        (?=.*[0-9]) → at least one digit
//
//        (?=.*[a-z]) → at least one lowercase letter
//
//        (?=.*[A-Z]) → at least one uppercase letter
//
//        (?=.*[@#$%^&+=!]) → at least one special character
//
//        .{8,} → at least 8 characters

        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password.");
        }
    }
}
