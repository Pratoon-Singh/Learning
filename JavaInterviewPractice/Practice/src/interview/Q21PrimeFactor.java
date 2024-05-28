package interview;

public class Q21PrimeFactor {
    public static void main(String[] args) {
        int num =6;
        findPrimeFactors(num);
        System.out.println("__________");

        for (int i = 1; i < num; i++) {
            if(findPrime(i)){
                System.out.println(i);
            }

        }
    }
    public static void findPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } }
    }

    public static boolean  findPrime(int num) {
        if(num==1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
}
