package interview;

import java.util.HashMap;
import java.util.Map;

public class CognitiveCloud7 {
    // Find the first non repeated character
    public static void main(String[] args) {
       String input = "Pratoon";
       Map<Character,Integer> charCounts = new HashMap<>();
       for (char c : input.toCharArray()){
           charCounts.put(c, charCounts.getOrDefault(c,0)+1);
       }
       for(Map.Entry<Character, Integer> entry: charCounts.entrySet()){
           if(entry.getValue()==1){
               System.out.println(entry.getKey()+" ");
           }
       }
    }
}
