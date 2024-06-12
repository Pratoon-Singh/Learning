package interview;

import java.util.ArrayList;
import java.util.List;

public class Q41FindConsecutive {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        //123 234 345 456 567 678;
        int k =3;
        int left = 0;
        int right = left + k - 1;
        ArrayList<List<Integer>> arrayList = new ArrayList<>();

        while(right< arr.length){
            ArrayList<Integer> values = new ArrayList<>();
            for (int i = left; i <= right; i++) {
               values.add(arr[i]);
            }
            arrayList.add(values);
            left++;
            right++;
        }
//        System.out.println(arrayList);
    }
}
