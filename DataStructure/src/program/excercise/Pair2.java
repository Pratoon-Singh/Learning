package program.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pair2 {

    public static void main(String[] args) {
        int result = 7;
        int[] array = {2, 4, 5, 8, 3};
        ArrayList<int[]> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int temp = Math.abs(array[i]-result);
            if (set.contains(temp)){
                int[] tds = {array[i], temp};
                arrayList.add(tds);
            }
            set.add(array[i]);
        }
        for (int[] i : arrayList){
            System.out.println(Arrays.toString(i));
        }
    }
}
