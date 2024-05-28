package interview;

public class Q5CheckStringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("wow"));
    }

    public static boolean isPalindrome(String str){
    StringBuilder stringBuilder = new StringBuilder();
        for(int i = str.length()-1;i>=0;i-- ){
            stringBuilder.append(str.charAt(i));
        }
        String str1 = new String(stringBuilder);
        return str1.equals(str);
    }
}
