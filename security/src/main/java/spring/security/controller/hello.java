package spring.security.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hello {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababa"));
    }

    public static List<String> longestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        List<String> sb = new ArrayList<>();
        while(left<=right){
        if(isPalindrome("h")){
            sb.add(String.valueOf(s.charAt(left) + s.charAt(right)));
            }
        else{
            right--;
        }
        }
        return sb;
    }


    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String s1 = new String(sb);
        if(s1.equals(s)){
            return true;
        }
        else {
            return false;
        }
    }
}
