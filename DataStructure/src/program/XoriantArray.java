package program;

import java.util.ArrayList;

public class XoriantArray {

    public static boolean ArrayChallenge(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        }


        int maxNumber = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxNumber)
                maxNumber = list.get(i);
        }
        list.remove(Integer.valueOf(maxNumber));


        int n = list.size();
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {

                    sum += list.get(j);
                }
            if (sum == maxNumber) {
                return true;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        // keep this function call here
//            Scanner s = new Scanner(System.in);
//            System.out.print(ArrayChallenge(s.nextLine()));

    }


}
