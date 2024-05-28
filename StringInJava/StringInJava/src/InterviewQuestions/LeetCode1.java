package InterviewQuestions;

import java.util.*;

public class LeetCode1 {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 0, -1, 5};
        int[] arr2 = {1, 2, 2, 3, 3, 1, 1, 1};
//        igetCount(arr);
        igetCount2(arr2);
    }

    private static void igetCount(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= 0) {
                continue;
            }
            if (sum > arr[i]) {
                continue;
            } else {
                sum = arr[i] + sum;
            }
        }
        System.out.println(sum);
    }

    public static void igetCount2(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int value = map.getOrDefault(i, 0);
            map.put(i, value + 1);
        }

        for (Map.Entry<Integer, Integer> entry1 : map.entrySet()) {
            System.out.println(entry1);
            for (Map.Entry<Integer, Integer> entry2 : map.entrySet()) {
//                System.out.println(entry2);
            }
        }
    }
}


