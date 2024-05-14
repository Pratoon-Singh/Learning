package InterviewQuestions;

public class $7_CompareStrings {
    /*
    Question :- Compare two string without built in functions
    Answer ;-
    the Built in functions are
    1. Using equals() Method
    2. Using equalsIgnoreCase() Method
    3. Using compareTo() Method
    4. Using compareToIgnoreCase() Method
     */
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        Object s3 = "Hello";
        System.out.println(isSame(s1,s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }

    private static boolean isSame(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
