package interview;

public class Q4FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorialOf(4));
    }
    public static int factorialOf(int num ){
        if(num==0||num == 1){
            return 1;
        }
        return num*factorialOf(num -1);
    }
}
