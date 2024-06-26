package array;

import java.util.Arrays;

public class O2_SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 5, 2, 4};
        int n = arr.length;
        int largestNumber = arr[0];
        int secondlargestNumber = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargestNumber && arr[i] != largestNumber) {
                secondlargestNumber = arr[i];
            }
        }
        System.out.println("this is Better approach \n Second Largest Element in the array is :- " + secondlargestNumber);

        System.out.println();
        int arr1[] = {8, 10, 10, 5, 7, 9};
        Arrays.sort(arr1);
        int largestNumber1 = arr1[arr1.length - 1];
        int secondLargest = 0;

        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] != largestNumber1) {
                secondLargest += arr1[i];
                break;
            }
        }
        System.out.println("this is brute force \n " + secondLargest + " is second largest ");
        System.out.println();

        int[] arr2 = {1,5,5,5,5,5,5,5};
        int n2 = arr2.length;
        int largestNumber2 = arr2[0];
        int secondlargestNumber2 = Integer.MIN_VALUE;


        for (int i = 0; i < n2; i++) {
            if (arr2[i] > largestNumber2) {
                secondlargestNumber2 = largestNumber2;
                largestNumber2 = arr2[i];
            } else if (arr2[i] < largestNumber2 && arr2[i] > secondlargestNumber2) {
                secondlargestNumber2 = arr2[i];
            }
        }

        System.out.println("this is Optimal force \n " + secondlargestNumber2 + " is second largest ");

    }
}
