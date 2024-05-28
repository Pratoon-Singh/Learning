package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q9RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 2, 2, 3, 4, 5};
//        Set<Integer> unique = new HashSet<>();
//        for (int num : arr){
//            unique.add(num);
//        }
//        System.out.println(unique);
//        removeDuplicates(arr);

    }

    public static void removeDuplicates(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arrayList.contains(arr[i])) {
                arrayList.add(arr[i]);
            }
        }
        System.out.println(arrayList);
    }

}
