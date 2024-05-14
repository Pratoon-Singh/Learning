package InterviewQuestions;

public class $11_isPalindrome {
    public static void main(String[] args) {
        String string ="wow";
        System.out.println(
        isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return string.equalsIgnoreCase(sb.toString());
    }
}
