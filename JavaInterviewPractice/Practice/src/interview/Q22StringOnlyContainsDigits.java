package interview;

public class Q22StringOnlyContainsDigits {

    public static void main(String[] args) {
        String str = "12345";
        boolean containsOnlyDigits = checkOnlyDigits(str);
        System.out.println(str + " contains only digits: " + containsOnlyDigits);
    }

    public static boolean checkOnlyDigits(String str) {
        return str.matches("\\d+");
    }
}
