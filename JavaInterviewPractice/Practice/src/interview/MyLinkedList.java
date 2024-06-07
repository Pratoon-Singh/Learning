package interview;

public class MyLinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    MyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void print() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value);
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public void append(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        length++;
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getTailNext() {
        System.out.println(tail.next.value);
    }

    public int getLength() {
        return length;
    }

    public Node getAtIndex(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

}

class Main1 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        myLinkedList.print();
//        myLinkedList.getHead();
//        myLinkedList.getTailNext();




    }
}
