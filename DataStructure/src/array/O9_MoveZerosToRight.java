package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O9_MoveZerosToRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 1, 0, 5, 6, 7};
        int n = arr.length;
        System.out.println(Arrays.toString(moveZerosOptimal(arr,n)));

    }
    public static int [] moveZerosBrute(int[] arr,int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }

        int size = list.size();


        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = size; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }
    public static int [] moveZerosOptimal(int[] arr,int n){
        if (arr == null || n == 0) return arr; // Edge case: empty array

        int i = 0;           // Iterator for current element
        int nonZeroIndex = 0; // Index to place the next non-zero element

        while (i < n) {
            if (arr[i] != 0) {
                // Swap elements if i and nonZeroIndex are different
                if (i != nonZeroIndex) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
            i++;
        }

        return arr;
    }
}


