package InterviewQuestions;

import java.util.Arrays;

public class XoriantArrayChallenge {
    public static void main(String[] args) {
        int[] array = {3, 5, -1, 8, 12};
//        int[] array = {5,7,16,1,2};
        boolean result = processArray(array);
        System.out.println(result);  // Should output true
    }

    public static boolean processArray(int[] array) {
        // Step 1: Sort the array (including negative numbers)
        Arrays.sort(array);
        System.out.println("Sorted Array"+Arrays.toString(array));

        // Step 2: Find and remove the first positive integer
        int positiveIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveIndex = i;
                System.out.println("positive index "+ positiveIndex);
                break;
            }
        }

        // If no positive number is found or all elements are positive, return false
        if (positiveIndex == -1 || array.length <= 1) {
            return false;
        }

        // Create a new array without the first positive integer
        int[] newArray = new int[array.length - 1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != positiveIndex) {
                newArray[index++] = array[i];
                System.out.println("new Array"+Arrays.toString(newArray));
            }
        }

        // Step 3: Calculate the sum of the remaining elements
        int sum = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            sum += newArray[i];
            System.out.println("Sum"+ sum);
        }

        // Step 4: Check if the sum equals the last element in the new array
        return sum == newArray[newArray.length - 1];
    }
}
