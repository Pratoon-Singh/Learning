package program;

import java.util.ArrayList;

public class $$Ganesh {
    public static void main(String[] args) {
        // Ek array ke index ko chor ke sabka multiplication do
        int [] arr = {1,2,3,4,5};
        int total=1;
        ArrayList finalArray=new ArrayList<>();
        for(int i = 0 ; i<arr.length;i++){
            total = arr[i]*total;
        }
        for (int i :arr) {
            finalArray.add(total/i);
        }
        System.out.println(finalArray);

        String given = "ABC";
        char[] stringInArray = given.toCharArray();
        System.out.println();
        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i <stringInArray.length ; i++) {
            char c = stringInArray[i];

        }
    }

}
