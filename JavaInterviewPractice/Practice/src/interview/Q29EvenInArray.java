package interview;

import java.util.ArrayList;

public class Q29EvenInArray {
    public static void main(String[] args) {
        // Write a program to add only even indexes of an array.
        int [] arr = {1,2,3,4,5,6};

        System.out.println(evenIndex(arr));
    }

    private static ArrayList<Integer> evenIndex(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = arr[0]; i <= arr.length; i++) {
            if(i%2==0){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
