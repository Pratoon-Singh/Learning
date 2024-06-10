package interview;

import java.util.Arrays;
import java.util.Optional;

public class CognitiveCloud11 {
    // Given an array of strings, group the anagrams together.
    public static void main(String[] args) {
        String[] input = {"wow", "mom", "wwo", "aab" , "baa"};
//        System.out.println(isAnagram("hello","hello"));
        for (int i = 0; i <= input.length-1; i++) {
            for (int j = i+1; j <= input.length-1 ; j++) {
                if(isAnagram(input[i],input[j] )){
                    System.out.println(input[i]+":"+input[j]);
                }
            }
        }
    }

    public static boolean isAnagram (String s1 , String s2){
        boolean flag = false;
        if(s1.length()!=s2.length()){
           flag = false;
           return flag;
        }
        char[] c1= s1.toCharArray();
        char[] c2= s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c2.length; i++) {
            if(c1[i]==c2[i]){
                flag = true;
            }
            else {
                flag = false;
            }
        }
        return flag;
    }
}
