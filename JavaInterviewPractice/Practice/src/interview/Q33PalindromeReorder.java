package interview;

import java.util.HashMap;
import java.util.Map;

public class Q33PalindromeReorder {
    public static void main(String[] args) {
        String string = "aabbc"; //abcba
        System.out.println(reorderPalindrome(string));
    }

    public static boolean reorderPalindrome(String input){
        Map<Character , Integer > counter = new HashMap<>();
        for (char c : input.toCharArray()) {
            if(counter.containsKey(c)){
                counter.put(c,counter.get(c)+1);
            }else {
                counter.put(c,1);
            }
        }
        int odd = 0;
        for (Character c : counter.keySet()){
            if(counter.get(c)%2!=0){
                odd++;
                if(odd==2) return false;
            }
        }
        return true;
    }
}
