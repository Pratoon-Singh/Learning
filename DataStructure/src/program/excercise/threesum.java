package program.excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int result = 7;
        int[] array = {2, 4, 5, 8, 3,6,1};

        ArrayList<int[]> pair = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                for(int k = j+1;k< array.length;k++){
                    int [] temp = {array[i], array[j],array[k]};{
                        if(array[i]+ array[j]+array[k]==result){
                            pair.add(temp);
                        }
                    }
                }
            }
        }
        pair.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}
