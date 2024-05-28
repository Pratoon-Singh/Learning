package interview;

public class Q6FibonacciSeries {
    public static void main(String[] args) {

        int num = 10;
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciSequence(i)+ " ");
        }
    }

    public static long fibonacciSequence(int n){
        if (n <= 1) {
            return n;
        }
        return (fibonacciSequence(n - 1) + fibonacciSequence(n - 2));
    }
}
