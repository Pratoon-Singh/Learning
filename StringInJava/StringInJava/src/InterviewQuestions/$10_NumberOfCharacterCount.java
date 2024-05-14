package InterviewQuestions;

public class $10_NumberOfCharacterCount {
    /*
    Find the number of words in a sentence and corresponding character

     */
    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(printWordAndCharacterCount(string));
    }

    public static String printWordAndCharacterCount(String sentence) {
        // Step 1: Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Step 2: Count the number of words
        int numWords = words.length;

        System.out.println("Word\t\tCharacters");
        System.out.println("--------------------------");

        // Step 3: Count the number of characters for each word and print them
        for (String word : words) {
            int numChars = word.length();
            System.out.println(word + "\t\t" + numChars);
        }

        System.out.println("--------------------------");
        return "Total words: " + numWords;
    }
}
