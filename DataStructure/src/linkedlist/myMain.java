package linkedlist;

import java.util.*;

public class myMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(3);
        myLinkedList.append(4);
        myLinkedList.append(2);

        MyLinkedList myLinkedList1 = new MyLinkedList(4);
        myLinkedList1.append(6);
        myLinkedList1.append(5);

//        myLinkedList.getTail();
//        myLinkedList.getHead();

        myLinkedList.print();

       String s = "pwwkew";

       int count=0;
        char[] charArray = s.toCharArray();
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(stringSet.contains(String.valueOf(s.charAt(i)))){
                stringSet.retainAll(stringSet);
            }
            stringSet.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(stringSet.size());
        System.out.println(stringSet);



//        String balanced = "{[]{}{}[]}";
//        isBalanced(balanced);
//
//
//        HashMap<String, String> hashMap = new HashMap<>();
//
//        hashMap.put("[", "]");
//        hashMap.put("{", "}");
//        hashMap.put("(", ")");
//
//        ArrayList arrayList = new ArrayList<>();
//
//        for (char s : balanced.toCharArray()) {
//            if (hashMap.containsKey(String.valueOf(s))) {
//                arrayList.add(s);
//            } else if (!arrayList.isEmpty() && String.valueOf(s).equals(hashMap.get(arrayList.getLast().toString()))
//            ) {
//                arrayList.removeLast();
//            }
//
//        }
//
//        System.out.println(arrayList);
    }

    public static boolean isBalanced2(String string) {
        Map<Character, Character> closed = new HashMap<>();
        closed.put('{', '}');
        closed.put('[', ']');
        closed.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()) {
            if (closed.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && c == closed.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }


    private static void isBalanced(String balanced) {


        Stack stack = new Stack<>();
        for (int i = 0; i < balanced.length(); i++) {
            if (balanced.charAt(i) == '{' || balanced.charAt(i) == '[' || balanced.charAt(i) == '(') {
                stack.add(balanced.charAt(i));
            }


            if (!stack.empty() && stack.peek().toString().equals("{") && balanced.charAt(i) == '}') {
                stack.pop();
            }
            if (!stack.empty() && stack.peek().toString().equals("[") && balanced.charAt(i) == ']') {
                stack.pop();
            }
            if (!stack.empty() && stack.peek().toString().equals("(") && balanced.charAt(i) == ')') {
                stack.pop();
            }
        }
//        System.out.println(stack);
        if (stack.empty()) {
            System.out.println("balanced");
        } else {
            System.out.println("Not balanced");
        }


    }
}
