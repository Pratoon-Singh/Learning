package technique;

public class SlidingWindowBruteForce{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        printkMax(arr,k);
    }

    private static void printkMax(int[] arr, int k) {
        int size = arr.length;
        int max,j;
        for (int i = 0; i < size-k; i++) {
            max = arr[i];
            for ( j = 1; j < k ; j++) {
                if(arr[i+j]>max){
                    max = arr[i+j];
                }

            }
            System.out.println(max+ " ");
        }
    }
}
