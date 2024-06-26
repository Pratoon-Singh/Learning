package patterns;

public class NTriangleP6 {
    /*
    Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output:

1 2 3
1 2
1
     */

    public static void main(String[] args) {
        nForest(3);
    }

    public static void nForest(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
