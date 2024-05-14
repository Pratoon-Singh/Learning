package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class $9_NonRepeatedCharacterInString {
    /*
    Question :- Find the first non-repeating character in string
    answer:- The approach is first change the string to character array
    then use the linked hash map (What is hash map if i want to store the object in key value pair we use hash map)
    Linked Hash map is also same but it can preserve the insertion order
     */
    public static void main(String[] args) {
        String string = "aabbc";
        System.out.println(firstNonRepeatedChar(string));
    }

    private static char firstNonRepeatedChar(String string) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < string.length(); i++) {
            charCount[string.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < string.length(); i++) {
            if (charCount[string.charAt(i)] == 1) {
                return string.charAt(i);
            }
        }

        // If no non-repeating character found, return a default value
         throw new RuntimeException("Didnt get any repeated character for "+ string);
    }
}
