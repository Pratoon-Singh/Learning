package InterviewQuestions;

import java.util.ArrayList;

public class $$PrimeNumber {
    public static void main(String[] args) {
        int number = 9;
        System.out.println( isPrime(number));
        //  Print all prime number in new array list
        int[] arr2= {1,2,3,5,6,8,10,11,13,15};
        ArrayList arrayList = new ArrayList<>();
        for (int i : arr2){
            if(isPrime(i)){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }

    private static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
