package recurssion;

public class Recursion {
    public static void main(String[] args) {
    sayHi(4);
    }
    public  static void sayHi(int count){
        System.out.println("Hi");
        if(count<=1){
            return;
        }
        sayHi(count-1);

    }
}
/*
What is recursion ?
When a method calls itself is called as recursion.
A Recursive method should always have an exit strategy, and a programmer should always see that strategy
should be met.
In the above code
if(count<=1){
            return;
        } this is the exit strategy.
 */