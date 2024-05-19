package program;

public class RecursiveFibo {

    public static void main(String[] args) {
//        System.out.println(fibonacci(9));
        int n = 9;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
