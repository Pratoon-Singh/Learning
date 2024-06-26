package interview;

import java.util.HashSet;
import java.util.Set;

public class Q47MergeStringsAlternately {
    public static void main(String[] args) {
//        String word1 = "abc", word2 = "pqr";
//        String word1 = "ab", word2 = "pqrs";
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(word1.charAt(i));
            }
            if (i < length2) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }

    public static class Q48GreatestCommonDivisorofStrings {
        public static void main(String[] args) {
    //        String str1 = "ABCABC", str2 = "ABC";
            String str1 = "ABABAB", str2 = "ABAB";
    //        String str1 = "LEET", str2 = "CODE";
            System.out.println(gcdOfStrings(str1, str2));
        }

        public static String gcdOfStrings(String str1, String str2) {
            StringBuilder stringBuilder = new StringBuilder();

            Set unique = new HashSet();
            int left = 0 ;
            int right = 0 ;
            while (left< str1.toCharArray().length){
                if(str2.length()<str1.length()){
                    right=0;
                }
                if(str1.charAt(left)==str2.charAt(right)){
                    unique.add(str2.charAt(right));
                }
                left++;
                right++;
            }
            stringBuilder.append(unique);


            return stringBuilder.toString();
        }
    }
}
