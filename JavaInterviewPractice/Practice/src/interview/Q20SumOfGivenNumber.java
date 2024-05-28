package interview;

public class Q20SumOfGivenNumber {
    public static void main(String[] args) {
        int a = 4;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        System.out.println(sum);
//        System.out.println(sumOfDigits(4));
    }
/*
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

 */


}
