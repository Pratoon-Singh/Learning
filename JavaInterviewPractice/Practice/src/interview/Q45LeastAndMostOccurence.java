package interview;
import java.util.*;
public class Q45LeastAndMostOccurence {

//      There are list of strings, find mostly and least occured  string in a list of string
//      ["abc", "def", "abc", "abc", "def", "fhg"]
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "def", "abc", "abc", "def", "fhg");
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count occurrences
        for (String s : input) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        // Initialize variables to track most and least frequent strings
        String mostFrequentString = null;
        int mostFrequentCount = Integer.MIN_VALUE;
        String leastFrequentString = null;
        int leastFrequentCount = Integer.MAX_VALUE;

        // Determine most and least frequent
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String key = entry.getKey();
            int count = entry.getValue();

            // Check for most frequent
            if (count > mostFrequentCount) {
                mostFrequentCount = count;
                mostFrequentString = key;
            }

            // Check for least frequent
            if (count < leastFrequentCount) {
                leastFrequentCount = count;
                leastFrequentString = key;
            }
        }

        // Print results
        System.out.println("Most frequent: " + mostFrequentString + " (occurs " + mostFrequentCount + " times)");
        System.out.println("Least frequent: " + leastFrequentString + " (occurs " + leastFrequentCount + " times)");
    }
}
