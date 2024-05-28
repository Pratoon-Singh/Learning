package interview;

import java.util.HashMap;

public class Q12CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 2};
        int element = 2;
//        int count = occurence(element,arr);
        int count = countOcc(arr,element);
        System.out.println(count);
    }

    private static int occurence(int element, int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            int value = hashMap.getOrDefault(num, 0);
            hashMap.put(num, value + 1);
        }
        if (hashMap.containsKey(element)) {
            return hashMap.get(element);
        } else {
            return 0;
        }

    }

    private static int  countOcc(int arr[] , int element){
        int count = 0;
        for (int num : arr){
            if(num == element){
                count++;
            }
        }
        return count;
    }
}
