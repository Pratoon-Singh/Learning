package program;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        reverseArray(array);

        System.out.print("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }


    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
