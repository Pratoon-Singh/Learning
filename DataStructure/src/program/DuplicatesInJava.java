package program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInJava {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,4,3,2,1};
        Set<Integer> set = new HashSet<>();
        for (int i : array){
            set.add(i);
        }
        System.out.println(set);

        System.out.println(removeDuplicates(array));
    }

    private static ArrayList<Integer> removeDuplicates(int[] array) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(!arrayList.contains(array[i])){
                arrayList.add(array[i]);
            }
        }
        return arrayList;
    }
}
