package array;

import java.util.Arrays;

public class O8_MoveRighDPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        System.out.println(Arrays.toString(moveRight(arr, n, d)));
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

    public static int[] moveRight( int[] arr,int n,int d){
        if (n == 0) return arr;  // Edge case: empty array
        d = d % n;  // Handle cases where d >= n
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, 0, n - 1);
        return arr;
    }
}
