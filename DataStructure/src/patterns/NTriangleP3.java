package patterns;

public class NTriangleP3 {
    /*
    Problem statement
Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: ‘N’ = 3

Output:
1
1 2
1 2 3
     */

    public static void main(String[] args) {
        nForest(3);
    }

    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
