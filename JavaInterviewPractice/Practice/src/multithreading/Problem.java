package multithreading;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        Integer num = 1318540;
        System.out.println(convertSecondMin(num));

    }

    private static int convertSecondMin(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) i--;
        if (i == -1) return num;

        int j = digits.length - 1;
        while (digits[j] <= digits[i]) j--;
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        int left = i + 1, right = digits.length - 1;
        while (left < right) {
            temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }
        return Integer.parseInt(String.valueOf(digits));
    }
}
