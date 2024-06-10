package interview;

import java.util.HashMap;
import java.util.Map;

public class CognitiveCloud5 {
    // Find the highest frequent character in a string using Hashmap
    public static void main(String[] args) {
        String word = "strawberry";
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : word.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        int occurence = 0;
        for (Integer maxChar : counts.values()){
            if(occurence<maxChar){
                occurence =maxChar;
            }
        }

        System.out.println(occurence);

        System.out.print("Character(s) with maximum frequency: ");
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == occurence) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
