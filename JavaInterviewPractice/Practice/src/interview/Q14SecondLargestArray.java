package interview;

import java.util.Arrays;

public class Q14SecondLargestArray {

    public static void main(String[] args) {
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int arr[] = {1,23,43,54,29,30};

        for (int i = 0; i < arr.length; i++) {
            if(first<arr[i]){
                second =first;
                first= arr[i];
            }
        }
 Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(first);
        System.out.println(second);
    }
}
