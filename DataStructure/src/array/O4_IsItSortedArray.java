package array;

public class O4_IsItSortedArray {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 4, 5, 5, 2};
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println(isItSorted(arr,n));

    }
    public static boolean isItSorted(int[] arr, int n){
        for (int i = 1; i <n; i++) {
            if(arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
}
