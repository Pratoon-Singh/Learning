package interview;

public class Q19FactorialIterative {
    public static void main(String[] args) {
        factorial(4);
    }
    public static void factorial(int num){
       int factorial = 1;
        for (int i = 2; i <=num ; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
