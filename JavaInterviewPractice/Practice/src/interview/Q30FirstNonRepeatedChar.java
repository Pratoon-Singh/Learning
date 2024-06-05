package interview;

import java.util.HashMap;
import java.util.Map;

public class Q30FirstNonRepeatedChar {
    public static void main(String[] args) {
        String string = "hello";
        char c = firstNonRepeatedChar1(string);
        System.out.println(c);

    }

    private static char firstNonRepeatedChar1(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }

        return '\0';
    }

    private static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }
}
