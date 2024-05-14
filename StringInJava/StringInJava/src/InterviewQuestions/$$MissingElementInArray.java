package InterviewQuestions;

import java.util.*;

public class $$MissingElementInArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 10, 11, 13, 15};
        // Find Missing Element in continues array.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                System.out.println(arr[i]+1);
            }
        }

    }
}
