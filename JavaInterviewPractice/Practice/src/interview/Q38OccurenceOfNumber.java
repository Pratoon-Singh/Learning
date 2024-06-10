package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q38OccurenceOfNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,8,8,8,9,10};
//        int[] arr ={8,8,8,8,8,8};
        int target = 8;
//       binarySearch(arr,target);
//
       HashMap<Integer, List<Integer>> map = new HashMap<>();
    for (int i : arr){
    List<Integer> result=indexes(arr,i);
    map.put(i,result);
}
        System.out.println(map);
        System.out.println(indexes(arr,target));

    }

    public  static List<Integer> indexes(int[] arr , int target){
        List<Integer> intial = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++) {
            if(target==arr[i]){
                intial.add(i);
            }
        }
        result.add(intial.get(0));
        result.add(intial.get(intial.size()-1));
        return result;

    }

//    public static void binarySearch(int[] arr, int target) {
//        int left = 0;
//        int right = arr.length - 1;
//        boolean flag = false;
//        int firstindex = 0;
//        int lastIndex = 0;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] == target) {
//                flag = true;
//                if(flag == true){
//                    right = mid-1;
//                }
//                else {
//                    left = mid+1;
//                }
//            }
//            if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//
//        }
//        System.out.println(firstindex+"+"+lastIndex);
//    }

    public static void binarySearch(int[] arr, int target) {
        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        System.out.println(firstIndex + " " + lastIndex);
    }

    // Helper function to find the first occurrence
    private static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Move to the left part
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Helper function to find the last occurrence
    private static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Move to the right part
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
