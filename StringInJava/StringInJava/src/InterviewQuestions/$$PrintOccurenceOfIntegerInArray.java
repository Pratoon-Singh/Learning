package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class $$PrintOccurenceOfIntegerInArray {
    public static void main(String[] args) {
        int[] arr = {1,234,44,45,44,1};
        Map map = new HashMap<>();
        for (int i : arr){
            if(map.containsKey(i)){
                int count = (int) map.get(i);
                map.put(i, ++count);
            }else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
