package program;

import java.util.HashMap;

public class OccurrenceInArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,1,4,5,6,4,4};
        System.out.println(occurrence(array));

    }
    public static HashMap<Integer, Integer> occurrence(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
