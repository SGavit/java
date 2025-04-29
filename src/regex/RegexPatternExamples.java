package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternExamples {
    public static void testPatterns(String input, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(input);
        System.out.println("Match found? " + matcher.find());
        System.out.println("------");

    }

    public static void main(String[] args) {
        testPatterns("hello",".");
        testPatterns("year 2025","\\d");

    }
}
