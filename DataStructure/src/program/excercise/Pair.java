package program.excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Pair {
    public static void main(String[] args) {
        int result = 7;
        int[] array = {2, 4, 5, 8, 3,6,1};
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int[] temp = {array[i], array[j]};
                if (array[i] + array[j] == result) {
                    arrayList.add(temp);
                }
            }
        }
        System.out.println("ArrayList elements:");
        for (int[] arr : arrayList) {
            System.out.print(Arrays.toString(arr));
        }


    }
}
