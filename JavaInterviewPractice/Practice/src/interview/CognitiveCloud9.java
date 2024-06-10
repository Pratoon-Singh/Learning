package interview;

public class CognitiveCloud9 {
    // Find the maximum element in an unsorted array
    public static void main(String[] args) {
        int[] arr = {23, 54, 12, 67, 89, 13, 46, 33};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]>secondMax){
                secondMax =max;
                max = arr[i];
            }
        }
        System.out.println(max+ ": "+ secondMax);
    }
}
