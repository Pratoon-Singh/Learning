package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Q35ReverseCharArray {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int temp = '\0';
        for (int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i] = (char) temp;

        }
        System.out.println(Arrays.toString(s));
    }
}
