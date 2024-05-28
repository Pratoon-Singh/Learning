package interview;

public class Q8MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,9,3,4,5,6,7};
        System.out.println(max(arr));
    }
    public static  int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
