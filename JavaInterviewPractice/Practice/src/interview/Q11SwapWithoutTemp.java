package interview;

public class Q11SwapWithoutTemp {


    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
