package interview;

import java.util.ArrayList;

public class Q37AverageOfSubArray {
    public static void main(String[] args) {
        int[] arr ={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K = 5;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length-K+1 ; i++) {
            int sum = 0;
            for (int j = i; j < i+K; j++) {
                sum += arr[j];
            }
            arrayList.add(sum/K);
        }
        System.out.println(arrayList);
    }
}
