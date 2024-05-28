package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayCount {
    public static void main(String[] args) {
//        int[] arr = {7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        int[] arr = {7, 7, 7, 7, 7, 8,8, 8, 8, 8, 8};

        getOutput(arr);


    }

    public static void getOutput(int[] arr) {
        int len = arr.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            int value = (int) map.getOrDefault(i,0);
            map.put(i,value+1);
        }
//        System.out.println(len);
        boolean allValuesSame = map.values().stream().distinct().count() == 1;
        if (allValuesSame) {
            int lowestKey = map.keySet().stream().min(Integer::compare).orElse(-1);
            System.out.println(lowestKey);
        }


    }

}


