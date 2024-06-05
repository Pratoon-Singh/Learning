package interview;

import java.util.*;

public class Q27HighestFrequency {

    public static void main(String[] args) {

        // find the highest frequency of the character in the string
        String str = "Strawberry";
        String result = frequencyChar(str);
        System.out.println(result);
    }

    private static String frequencyChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);
        }

        char maxFreqChar = '\0';
        int maxFreq = -1;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqChar = entry.getKey();
            }
        }


        return maxFreqChar+":"+maxFreq;

    }

}
