package interview;

import java.util.Stack;

public class Q32ValidParenthesis {
    public static void main(String[] args) {
        String parameter = "{[()]}";
        System.out.println(validOrNot(parameter));
    }

    public static boolean validOrNot(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (
                    stack.empty() ||
                            ch == '{' ||
                            ch == '(' ||
                            ch == '['
            ) {
                stack.push(ch);
            } else if
            (
                    (ch == '}' && stack.peek() == '{') ||
                            (ch == ']' && stack.peek() == '[') ||
                            (ch == ')' && stack.peek() == '(')
            ) {
                stack.pop();
            }
        }
        if(stack.empty()){
            return true;
        }
        else {
            return false;
        }
    }
}
