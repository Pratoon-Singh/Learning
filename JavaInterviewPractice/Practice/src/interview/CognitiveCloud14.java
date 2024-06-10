package interview;

import java.util.LinkedList;

public class CognitiveCloud14 {
    // Sorting a linked list without using any extra space

    static class MyLinkedList {
        Node head;
        Node tail;
        int length;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        MyLinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public Node append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
            return newNode;
        }

        // Helper method to get the middle of the list
        private Node getMiddle(Node head) {
            if (head == null) return null;
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Helper method to merge two sorted lists
        private Node merge(Node left, Node right) {
            Node dummy = new Node(0); // Temporary node to form the new sorted list
            Node current = dummy;

            while (left != null && right != null) {
                if (left.value < right.value) {
                    current.next = left;
                    left = left.next;
                } else {
                    current.next = right;
                    right = right.next;
                }
                current = current.next;
            }
            current.next = (left != null) ? left : right;
            return dummy.next;
        }

        // Merge Sort implementation
        public Node mergeSort(Node head) {
            if (head == null || head.next == null) return head;
            Node middle = getMiddle(head);
            Node nextOfMiddle = middle.next;
            middle.next = null; // Split the list into two halves

            Node left = mergeSort(head); // Sort the left half
            Node right = mergeSort(nextOfMiddle); // Sort the right half

            return merge(left, right); // Merge the sorted halves
        }

        // Wrapper method to start merge sort
        public void sort() {
            head = mergeSort(head);
            // Update the tail after sorting
            Node temp = head;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
        }

    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(0);
        System.out.println("Original List:");
        linkedList.print();

        linkedList.sort();
        System.out.println("Sorted List:");
        linkedList.print();
    }
}
