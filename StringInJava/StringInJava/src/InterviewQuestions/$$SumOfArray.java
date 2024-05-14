package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class $$SumOfArray {
    // given array   int [] number2 = {1,7,6,2,4,4,3,9,8}; give the pair which together add and give eight
    public static void main(String[] args) {
        int [] number2 = {1,7,6,2,4,4,3,9,8};
        ArrayList<int[]> finalArray =new ArrayList();
        for (int i = 0; i < number2.length-1; i++) {
            for (int j = i+1; j <number2.length ; j++) {
                if(number2[i]+number2[j]==8){
                    int[] temp = {number2[i], number2[j]};
                    finalArray.add(temp);
                }
            }

        }

        for (int[] pair : finalArray) {
            System.out.println(Arrays.toString(pair));
        }
    }


}

