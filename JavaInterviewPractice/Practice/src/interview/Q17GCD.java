package interview;

public class Q17GCD {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        System.out.println(gcd(a,b));
    }

    private static int findGCD(int a, int b) {
        if(b==0){
            return a;
        }
        return findGCD(b,a%b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
