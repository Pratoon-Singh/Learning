package array;

import java.util.Arrays;

public class O1_LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 4, 8, 4, 3, 10};
        int n = arr.length;
        int largestNumber = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        System.out.println("this is recursive approach \n Largest Element in the array is :- " + largestNumber);


        int arr1[] = {8, 10, 5, 7, 9};
        Arrays.sort(arr1);
        System.out.println("this is brute force \n " + arr1[arr1.length - 1] + " is largest ");
    }
}
