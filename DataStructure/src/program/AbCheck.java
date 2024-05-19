package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbCheck {


    private static String abCheck(String str) {
        Pattern pattern = Pattern.compile("(a...b|b...a)");
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "true" : "false";
    }

    public static void main(String[] args) {
        var result1 = abCheck("lane borrowed");
        System.out.println(result1);
        var result2 = abCheck("australia");
        System.out.println(result2);
    }

}
