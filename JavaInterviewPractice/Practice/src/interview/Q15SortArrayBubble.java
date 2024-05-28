package interview;

import java.util.Arrays;

public class Q15SortArrayBubble {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 67};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
