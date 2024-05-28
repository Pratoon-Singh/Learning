package InterviewQuestions;

import java.util.Arrays;
import java.util.Queue;

public class $6_CountNumberOfWords {
    /*
    Question :- Count number of words in java
    Answer:-
     */
    public static void main(String[] args) {
        String string = "the sky is blue";
        System.out.println(reverseWords(string));
     }

    public static String reverseWords(String s) {
        String temp = s.strip(); // Use temp instead of s
        String[] split = temp.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            newString.append(split[i]);
            if (i != 0) {
                newString.append(" ");
            }
        }

        return newString.toString();
    }
}
