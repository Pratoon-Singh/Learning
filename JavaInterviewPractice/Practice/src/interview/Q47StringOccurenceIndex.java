package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Q47StringOccurenceIndex {

    public static void main(String[] args) {

//        String name = "qweabrtcabcyuiopabc";
        String name = "arabc";
        String target = "abc";
        char[] nameCharArray = name.toCharArray();
        char[] targetCharArray = target.toCharArray();

        ArrayList<Integer> stringOccurence = new ArrayList<>();

        int left = 0;
        int right = 0;
        boolean flag = true;
        while (flag) {
            int resetLeft = 0;
            int firstTime = 0;
            if(left==targetCharArray.length){
                left=resetLeft;

            }
            if (targetCharArray[left] == nameCharArray[right]) {
                left = left+1;
            }
            else {
                left=resetLeft;
                right++;
            }
            if(right== nameCharArray.length){
                flag= false;
            }
        }
        System.out.println(stringOccurence);
    }

}
