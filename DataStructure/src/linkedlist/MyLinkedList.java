package linkedlist;

public class MyLinkedList {

    Node head;
    Node tail;
    int length;

    MyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        length = 1;

    }

     class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    // append prepend removLast remove first print

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node getTail() {
        System.out.println("Tail " + tail.value);
        return tail;
    }

    public Node getHead() {
        System.out.println("Head " + head.value);
        return head;
    }

    public int getLength() {
        return length;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        int a = Integer.parseInt(l1.toString()) + Integer.parseInt(l2.toString());
        System.out.println(a);
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", length=" + length +
                '}';
    }
}
