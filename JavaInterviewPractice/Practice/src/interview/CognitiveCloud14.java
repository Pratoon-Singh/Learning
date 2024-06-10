package interview;

import java.util.LinkedList;

public class CognitiveCloud14 {
    // Sorting a linked list without using any extra space

    static class MyLinkedList{
        Node head;
        Node tail;
        int length;

        class Node{
            int value ;
            Node next;
            Node(int value){
                this.value = value;
            }
        }

        MyLinkedList(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail= newNode;
            length = 1;
        }

        public void print() {
            Node temp = head;
            while (temp.next == null) {
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            System.out.println();
        }

        public Node append(int value){
            Node newNode = new Node(value);
            if(length==0){
                head = newNode;
                tail= newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
            return newNode;
        }


    }
    public static void main(String[] args) {
    MyLinkedList linkedList = new MyLinkedList(0);
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);
    linkedList.print();
    }
}
