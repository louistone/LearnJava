package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static final String  EXAMPLE_TEST = "This is my small example string which I'm going to use" +
            "for pattern matching.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
    }
}
