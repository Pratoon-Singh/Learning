package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class XoriantReverseString {
    public static void main(String[] args) {
        String string = "fun !! time";
        System.out.println(processString(string));
    }
    public static String processString(String input) {
        // Remove punctuation
        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = cleanedInput.split("\\s+");

        // Count the occurrence of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        // Find the word with the highest frequency
        String highestFreqWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                highestFreqWord = entry.getKey();
            }
        }
        // Reverse the highest frequency word
        String reversedHighestFreqWord = new StringBuilder(highestFreqWord).reverse().toString();
        // Return the reversed highest frequency word
        return reversedHighestFreqWord;
    }
}
