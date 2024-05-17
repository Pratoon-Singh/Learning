package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePermutations {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = getPermutations(str);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        result.add(new String(chars));

        while (true) {
            int i = chars.length - 1;
            while (i > 0 && chars[i - 1] >= chars[i]) {
                i--;
            }

            if (i <= 0) {
                break;
            }

            int j = chars.length - 1;
            while (chars[j] <= chars[i - 1]) {
                j--;
            }

            swap(chars, i - 1, j);

            int k = chars.length - 1;
            while (i < k) {
                swap(chars, i, k);
                i++;
                k--;
            }

            result.add(new String(chars));
        }

        return result;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
