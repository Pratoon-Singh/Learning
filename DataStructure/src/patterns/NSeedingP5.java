package patterns;

public class NSeedingP5 {
    /*
    Problem statement
Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output:
* * *
* *
*
     */

    public static void main(String[] args) {
        nForest(3);
    }

    public static void nForest(int n) {
        for (int i = n; i > 0; i--) {
            //0 1 2
            for (int j = 0; j < i; j++) {
                // 0-> 0 1 2 ;
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
