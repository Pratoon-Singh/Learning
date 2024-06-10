package interview;

import java.util.HashMap;
import java.util.Map;

public class CognitiveCloud6 {
    // Write a program to add only even indexes of an array.
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int sumOfEvenIndex = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(i%2==0){
                sumOfEvenIndex = arr[i]+sumOfEvenIndex;
            }
        }
        System.out.println(sumOfEvenIndex);
    }
}
