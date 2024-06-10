package interview;

import java.util.Arrays;

public class Q39SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,1,1,5,2,3,4,1,1,1,5,6,7,8};
        int k = 5;
        int left = 0;
        int right = k;
        int intialSum=0;
        for (int i = 0; i < k; i++) {
            intialSum+=arr[i];
        }
        int minSum= intialSum;
        while(right<arr.length){
            intialSum = intialSum-arr[left]+arr[right];
            if(intialSum<minSum){
                minSum=intialSum;
            }
            left++;
            right++;
        }
        System.out.println(minSum);
    }
}
