package interview;

import java.util.Stack;

public class CognitiveCloud15 {
    // To check if a given string represents valid parenthesis
    public static void main(String[] args) {

        String input = "{}(]()";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= input.length()-1; i++) {
            if(
                    input.charAt(i)=='{'||
                    input.charAt(i)=='('||
                    input.charAt(i)=='['
            ){
                stack.push(input.charAt(i));
            } else if (
                    input.charAt(i)=='}'&& stack.peek()== '{' ||
                    input.charAt(i)==')'&& stack.peek()== '(' ||
                    input.charAt(i)==']'&& stack.peek()== '['
            ) {
                stack.pop();
            }
        }
        if(stack.empty()){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }
}
