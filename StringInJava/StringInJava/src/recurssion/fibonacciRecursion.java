package recurssion;

public class fibonacciRecursion {
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50;
        fibonacciCache = new long[n + 1];
        System.out.println(fibonacciSequence(n));

    }

    private static long fibonacciSequence(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacciSequence(n - 1) + fibonacciSequence(n - 2));
    }
}
