package interview;

import java.util.Stack;

public class Q24Stack {
    // LIFO last in first out
    Node top;
    int height;

    Q24Stack(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void peek() {
        System.out.println("Top :- " + top.value);
    }

    public void getHeight() {
        System.out.println("Size :- "+ height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top=newNode;
        }else {
            newNode.next = top;
            top = newNode;
            height++;
        }
    }

    public Node pop (){
        if(height==0)return null;
        Node temp = top;
        top= top.next;
        temp.next=null;
        height--;
        return temp;
    }


}

class StackMain {
    public static void main(String[] args) {

        Q24Stack stack = new Q24Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
//        stack.print();
        stack.peek();
//        stack.getTop();
//        stack.getHeight();

        Stack<Integer> stack1 = new Stack<>();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        stack1.add(4);
        stack1.pop();

        System.out.println(stack1.peek());
    }
}
