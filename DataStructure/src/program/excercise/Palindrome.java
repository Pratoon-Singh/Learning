package program.excercise;


import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {


        String str = "wwwwoowwwbcv";
//        System.out.println(isPalindromeY(str));
        getWordsCount(str);

    }

    private static boolean isPalindromeY(String str) {
        int left = 0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void getWordsCount(String str){
        Map<Character,Integer> wordCount = new HashMap<>();
        for(char  c : str.toCharArray()){
            int val = wordCount.getOrDefault(c,0);
            wordCount.put(c, val + 1 );
        }

        wordCount.forEach((key,value)-> System.out.print(key.toString()+value.toString()));
        System.out.println();
        wordCount.forEach((key,value)-> System.out.print(key.toString().repeat(value)));
        System.out.println();
        System.out.println(wordCount);







//        return wordCount.toString();
    }

    private static String getWordsC(String str){


        return "";
    }

}
