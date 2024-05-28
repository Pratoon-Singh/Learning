package interview;

public class Q3checkEvenOrOdd {
    public static void main(String[] args) {

        isEvenOrOdd(12);
    }

    public static void isEvenOrOdd(int num){
        if(num%2==0){
            System.out.println(num + " is Even");
        }else {
            System.out.println(num+ " is Odd");
        }
    }
}
