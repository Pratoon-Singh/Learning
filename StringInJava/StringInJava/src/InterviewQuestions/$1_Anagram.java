package InterviewQuestions;

public class $1_Anagram {
    /*
     Question Write a java program to check the given two string is Anagram or not.
     Answer:- The string is called anagram if the element in the first string is present in the second String
              without preserving the order.
     aab , baa both have 2 a and 1 b
    */
    public static void main(String[] args) {

        String s1 = "aab";
        String s2 = "baa";
        System.out.println(checkAnagram(s1.toLowerCase(),s2.toLowerCase()));
    }

    private static boolean checkAnagram(String s1, String s2) {
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i< count.length ; i++){
            if(count[i]!=0)
                return false;

        }
        return true;
    }
}
