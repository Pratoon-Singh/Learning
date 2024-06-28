package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class O6_MoveLeftOnePosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5 };
        int n = arr.length;

        System.out.println(Arrays.toString(moveLeft(arr,n)));
    }

    public static int[] moveLeft( int[] arr,int n){
        int temp = arr[0];
        for (int i = 1; i < n ; i++) {
            arr[i-1] =arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

}
