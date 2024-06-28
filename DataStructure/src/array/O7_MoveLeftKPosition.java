package array;

import java.util.Arrays;

public class O7_MoveLeftKPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;

//        System.out.println(Arrays.toString(moveLeftBrute(arr,n,3)));
        System.out.println(Arrays.toString(moveLeftOptimal(arr,n,3)));
    }

    public static int[] moveLeftBrute( int[] arr,int n,int d){
        d = d % n;
        int count = 0;
        while(count!=d) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            count++;
        }
        return arr;
    }

    public static void reverse(int[] array , int start , int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end]= temp;
            start++;
            end--;
        }
    }

    public static int[] moveLeftOptimal( int[] arr,int n,int d){
        if (n == 0) return arr;  // Edge case: empty array
        d = d % n;  // Handle cases where d >= n
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

}
