package interview;

import java.util.HashMap;

public class Q34PrefixString {
    public static void main(String[] args) {
        String s1 = "azure";
        String s2 = "bcure";
        StringBuilder stringBuilder = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i))
            {
                stringBuilder.append(s1.charAt(i));
            }else {
             break;
            }
        }
        System.out.println(stringBuilder);
    }
}

