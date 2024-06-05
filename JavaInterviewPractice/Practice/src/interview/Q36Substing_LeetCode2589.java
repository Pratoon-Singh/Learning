package interview;

public class Q36Substing_LeetCode2589 {
    public static void main(String[] args) {
//        String s = "z";
//        String t = "abcde";
        String s = "lbg";
        String t = "g";
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                stringBuilder.append(t.charAt(i));
            } else {
                break;
            }
        }
        int length = stringBuilder.length();
        int count = 0;
            for (int i = length+1; i <= t.length(); i++) {
                count++;
            }
            return count;
    }
}
