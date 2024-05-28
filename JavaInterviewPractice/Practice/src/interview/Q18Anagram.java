package interview;

import java.util.Arrays;

public class Q18Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("pratoon", "nooprat"));
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] charArray = a.toCharArray();
        char[] charArray1 = b.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray);
        return Arrays.equals(charArray1,charArray);

    }
}
