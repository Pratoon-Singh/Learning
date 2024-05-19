import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Questions
{
    public static void main(String[] args) {
        int [] array = {5, 56 ,76, 56, 96,44, 12};
        String string = "aabcbcbcc";
        String name = "Pratoon Singh";
        System.out.println(getConsecutiveCount(string));

//        System.out.println(getlargestElmentInArray(array));

//        System.out.println(getSecondLargestInArray(array));

        System.out.println(getCountInPair(string));

//          System.out.println(reverseString(name));

//          System.out.println(reverseString2(name));

//        StringBuilder stringBuilder = new StringBuilder(name);

//        System.out.println(stringBuilder.reverse());
    }
    //________________________________________________________________________________________________________
    private static StringBuilder reverseString(String string) {
        StringBuilder stringBuilder= new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            stringBuilder.append(ch[i]);
        }
        return stringBuilder;
    }
//________________________________________________________________________________________________________
    private static String reverseString2(String string) {
        char[] ch = string.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            // Swap characters at left and right positions
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            // Move the pointers inward
            left++;
            right--;
        }
        // Convert char array back to string
        return new String(ch);
    }
    //________________________________________________________________________________________________________
    private static String  getCountInPair(String string) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : string.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Building the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getValue()).append(entry.getKey());
        }

        return charCountMap.entrySet().toString();

//        return result.toString();

    }
    //________________________________________________________________________________________________________
    private static StringBuilder getConsecutiveCount(String string){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i) == string.charAt(i-1)){
                count++;
            }else {
                stringBuilder.append(count).append(string.charAt(i - 1));
                count = 1;
            }
        }
        stringBuilder.append(count).append(string.charAt(string.length() - 1));

        return stringBuilder;
    }
    //________________________________________________________________________________________________________
    private static int getSecondLargestInArray(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] < firstLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
    //________________________________________________________________________________________________________
    private static int getlargestElmentInArray(int[] array) {

        int temp = Integer.MIN_VALUE ;
        for (int i= 0 ; i<array.length;i++){
            if(array[i]>temp){
                temp=array[i];
            }
        }
        return temp;
    }
    //________________________________________________________________________________________________________
}
