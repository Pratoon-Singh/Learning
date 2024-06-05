package interview;

import java.util.ArrayList;
import java.util.List;

public class Q31SplitStringBySpace {
    public static void main(String[] args) {
        String str = "This is a sample string";
        String[] words = splitStringBySpace1(str);

        // Print the split words
        for (String word : words) {
            System.out.println(word);
        }
    }
    private static String[] splitStringBySpace1(String str) {
        List<String> wordsList = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the current character is not a space, add it to the current word
            if (c != ' ') {
                word.append(c);
            } else {
                // If the current character is a space and the current word is not empty,
                // add the current word to the list of words and reset the current word
                if (word.length() > 0) {
                    wordsList.add(word.toString());
                    word.setLength(0); // Reset the StringBuilder
                }
            }
        }

        // Add the last word if it's not empty
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }

        // Convert the list of words to an array
        String[] wordsArray = new String[wordsList.size()];
        return wordsList.toArray(wordsArray);
    }

    private static String[] splitStringBySpace(String str) {
        // Split the string by space using the split() method
        // The split() method takes a regular expression as an argument
        // "\\s+" is a regular expression that matches one or more whitespace characters
        return str.split("\\s+");
    }
}


