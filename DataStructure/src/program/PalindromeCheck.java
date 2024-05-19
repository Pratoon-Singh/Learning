package program;

public class PalindromeCheck {
    public static void main(String[] args) {
        String string ="wow";
        System.out.println(
        isPali(string));
    }

    private static boolean isPali(String string ){
        int left = 0;
        int right = string.length()-1;
        while(left<right){
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return string.equalsIgnoreCase(sb.toString());
    }
}
