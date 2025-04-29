package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "My phone number is 123-456-7890";
        String patternString = "\\d{3}-\\d{3}-\\d{4}";


        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        //System.out.println(matcher.find());
        if(matcher.find())
        {
            System.out.println("Found the phone number:"+matcher.group());
        }
        else {
            System.out.println("No phone number found.");
        }

    }
}
