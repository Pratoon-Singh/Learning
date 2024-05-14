package InterviewQuestions;

public class $3_EvenLengthWords {
    /*
    Question :- Write a java program to print even length words in a String?
    Answer :- Hell World hell- 4 world -5;

     */
    public static void main(String[] args) {
        String string = "Hell World this is jason the Java developer";
        System.out.println(evenLengthWords(string));
    }

    private static String evenLengthWords(String string) {
        StringBuilder result = new StringBuilder();
        for (String str : string.split(" ")) {
            if (str.length() % 2 == 0) {
                result.append(str).append(" ").append(str.length()).append("\n");
            }
        }
        return result.toString().isEmpty() ? "No even length words found" : result.toString();
    }

}
