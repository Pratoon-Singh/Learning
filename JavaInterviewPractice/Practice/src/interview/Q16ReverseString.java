package interview;

public class Q16ReverseString {
    public static void main(String[] args) {
        String str = "hello this is java";
        StringBuilder s = new StringBuilder(str);
        for (int i = str.length()-1; i >=0 ; i--) {
             s.append(str.charAt(i));
        }
        System.out.println(s);

    }
}
