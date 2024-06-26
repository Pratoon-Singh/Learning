package patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciTriangle {
    public static void main(String[] args) {
        int number = 9;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            arrayList.add(fibo(i));
        }
//        System.out.println(arrayList);
        pattern(arrayList);

    }

    public static void pattern(ArrayList<Integer> arrayList) {

        for (int i = 0; i <arrayList.size(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrayList.get(j)+" ");
            }
            System.out.println();
        }

    }

    public static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return (fibo(num - 1) + fibo(num - 2));
    }
}
