package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CognitiveCloud16 {
    // Re-arrange the string and find it is a palindrome or not
    public static void main(String[] args) {

        String input = "aaaabc";
        Map<Character,Integer> charCount = new HashMap<>();
        for(char c : input.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        int oddCount=0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        if(oddCount<=1){
            System.out.println("Input string can be converted in palindrome : "+input);
        }else {
            System.out.println("Input string cannot be converted in palindrome : "+input);
        }
    }
}
