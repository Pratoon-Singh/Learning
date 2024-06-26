package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class O5_RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 4, 5, 5, 2};
//        int[] arr = {1,2,2,3,4,4,5};
        int[] arr = {1 ,1, 2, 3, 3, 4, 5, 5, 5 };
        int n = arr.length;

//        System.out.println(Arrays.toString(removeDuplicates(arr,n)));
//        System.out.println(removeDuplicatesBrute(arr,n));
        System.out.println(Arrays.toString(removeDuplicates2pointer(arr, n)));

    }

    public static int[] removeDuplicates(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                arr[i] = Integer.MAX_VALUE;
            }

        }
        Arrays.sort(arr);
        return arr;
    }

    public static Set<Integer> removeDuplicatesBrute(int[] arr, int n) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unique.add(arr[i]);
        }
        return unique;
    }

    public static int[] removeDuplicates2pointer(int[] arr, int n) {

        int left = 0;
        int right = left + 1;
        int count = 1;
        while (right < n) {
            if (arr[left] == arr[right]) {
                right++;
            } else {
                arr[left + 1] = arr[right];
                left++;
                right++;
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }
}
