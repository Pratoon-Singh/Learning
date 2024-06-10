package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CognitiveCloud8 {
    // Write a program to split the string by space
    public static void main(String[] args) {
        String input = "Pratoon  Singh";
        String[] split = input.split("\\s+");
        for (String s : split){
            System.out.println(s);
        }
    }
    /*
   Difference between \\s+ and \\s

    The first one matches a single whitespace, whereas the second one matches one or many whitespaces.
    They're the so-called regular expression quantifiers
     */
}
