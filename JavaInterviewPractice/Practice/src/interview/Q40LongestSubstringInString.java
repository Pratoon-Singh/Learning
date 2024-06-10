package interview;


public class Q40LongestSubstringInString {
    public static void main(String[] args) {
        String input = "aabbbcc";
        char[] inputChar = input.toCharArray();
        StringBuilder currentSubstring = new StringBuilder(" ");
        StringBuilder longestSubstring = currentSubstring;
        int right = 0;
        while (right < inputChar.length) {
            if (inputChar[right] == currentSubstring.charAt(0)) {
                currentSubstring.append(inputChar[right]);
            } else {
                currentSubstring = new StringBuilder(inputChar[right] + "");
            }
            if (longestSubstring.length() < currentSubstring.length()) {
                longestSubstring = currentSubstring;
            }
            right++;
        }
        System.out.println(longestSubstring);


    }
}
