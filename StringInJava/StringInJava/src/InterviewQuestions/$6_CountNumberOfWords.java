package InterviewQuestions;

import java.util.Queue;

public class $6_CountNumberOfWords {
    /*
    Question :- Count number of words in java
    Answer:-
     */
    public static void main(String[] args) {
        String string = "    Welcome   to Xenos Planet";
        // Remove leading and trailing whitespace
        String trim = string.trim();
        String[] splitString = trim.split("\\s+");
        System.out.println(splitString.length);
     }
}
