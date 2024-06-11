package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 66, 76, 12, 54, 45};
        int target = 66;

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,target));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    private static int binarySearch(int[] arr, int target){
        bubbleSort(arr);
    int left=0;
    int right = arr.length-1;
    while (left<=right){
        int mid = left + right-left/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]<target) {
            left = mid+1;
        }else {
            right= mid -1;
        }
    }
    return -1;
    }
}
