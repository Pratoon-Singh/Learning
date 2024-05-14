package InterviewQuestions;

import java.util.Stack;

public class $2_isWellFormed {
    /*
    Question :- Check weather the string is well formed or not?
    Answer :- For every opening bracket there should be closing bracket eg. {} () [] these are balanced
    {() - this is not balanced
    For this solution we use Stack

     */
    public static void main(String[] args) {

        String string = "{[()]}";
//        System.out.println(isBalanced(string));
        System.out.println(isBalanced2(string));
    }

    private static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(stack.empty()) {
                stack.push(ch);
            } else if (ch == '{'||ch=='[' ||ch=='(') {
                stack.push(ch);
            }
            else if(ch=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if(ch==']' && stack.peek()=='['){
                stack.pop();
            }
            else if(ch==')' && stack.peek()=='('){
                stack.pop();
            }
        }
        if (stack.empty()){
            System.out.println("Given String is well formed and balanced");
            return true;
        }else {
            System.out.println("Given String is not well formed");
        }
        return false;
    }

    private static boolean isBalanced2(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (
                    stack.empty() ||
                    ch == '{' ||
                    ch == '[' ||
                    ch == '('
            )
            {
                stack.push(ch);
            }
            else if
            (
                    (ch == '}' && stack.peek() == '{') ||
                    (ch == ']' && stack.peek() == '[') ||
                    (ch == ')' && stack.peek() == '(')
            )
            {
                stack.pop();
            }
        }
        boolean isWellFormed = stack.empty();
        System.out.println(isWellFormed ? "Given String is well formed and balanced" : "Given String is not well formed");
        return isWellFormed;
    }

}
