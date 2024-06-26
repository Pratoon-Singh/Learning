package multithreading.executor;

import java.sql.Array;
import java.util.*;

public class MainEx {
    public static void main(String[] args) {

        String str = "pwwkew";

        System.out.println(lengthOfLongestSubstring(str));

    }
    public static int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = i+1;
        boolean flag = true;
        List<String> temp = new ArrayList<>();
        Set<String> set= null ;
        List<Character> list = new ArrayList<>();
        while (flag) {

            if(j==s.length()-1){
                flag=false;
            }
            if(s.charAt(i)!=s.charAt(j)){
                if(!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                j++;}
            }
            else {
                String substring = s.substring(i, j);
                temp.add(substring);
                set=new HashSet<>(temp);
                i = j;
                j = j+1;
            }
        }
        System.out.println(set);
        return set.size();

    }
}




