package array;

import java.util.Arrays;

public class O3_SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,1,4, 5, 5, 2};
        int n = arr.length;
        int smallest= arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i]< smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]>smallest && arr[i]<secondSmallest) {
                secondSmallest=arr[i];
            }
        }

        System.out.println("The smallest is :- "+ smallest+"\nand the second samllest is :- "+ secondSmallest);
    }
}
