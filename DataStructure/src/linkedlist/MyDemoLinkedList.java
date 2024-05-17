package linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class MyDemoLinkedList {
    private Node head;
    private Node tail;
    private int length;

    MyDemoLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;

    }

    class Node {
        int value;
        Node next; // This variable can point to next node.

        Node(int value) {
            this.value = value;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

//    public void getHead() {
//        System.out.println("head -> " + head.value);
//    }
//
//    public void getTail() {
//        System.out.println("Tail -> " + tail.value);
//    }
//
//    public void getLength() {
//        System.out.println("length -> " + length);
//    }
public Node getHead() {
    return head;
}

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

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

    public Node removelast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
        return node;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) {
            tail = null;
            return null;
        }
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index <0 || index>=length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index,int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index,int value){
        if(index<0||index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node node = new Node(value);
        Node temp = get(index-1);
        node.next=temp.next;
        temp.next=node;
        length++;
       return true;
    }

    // Remove the node at the specified index in the list
    public Node remove(int index) {
        // Check if the index is out of bounds
        if (index < 0 || index >= length) return null;
        // If the index is 0, remove the first node in the list
        if (index == 0) return removeFirst();
        // If the index is the last one in the list, remove the last node
        if (index == length - 1) return removelast();

        // Get the previous node of the one to be removed
        Node prev = get(index - 1);
        // Get the node to be removed
        Node temp = prev.next;

        // Update the previous node's pointer to skip over the removed node
        prev.next = temp.next;
        // Detach the removed node from the list
        temp.next = null;
        // Decrease the length of the list
        length--;
        // Return the removed node
        return temp;
    }
        public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;

    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    public void removeDuplicates() {
        // Step 1: Create a Set to store unique node values.
        // We initialize a HashSet, which allows for fast look-up
        // to check for duplicates later on.
        Set<Integer> values = new HashSet<>();

        // Step 2: Initialize a Node variable 'previous' to null.
        // 'previous' will help us unlink a node if it's a duplicate.
        Node previous = null;

        // Step 3: Initialize 'current' to point to the head node.
        // 'current' will be used to iterate through the linked list.
        Node current = head;

        // Step 4: Begin iteration through the linked list.
        // We will keep iterating until 'current' becomes null,
        // indicating we have reached the end of the list.
        while (current != null) {

            // Step 5: Check for duplicates.
            // We check if the current node's value is already in the set.
            if (values.contains(current.value)) {

                // Step 6: Remove the duplicate node.
                // By setting 'previous.next' to 'current.next',
                // we remove the link to 'current', effectively
                // deleting it from the list.
                previous.next = current.next;

                // Step 7: Update the length of the list.
                // Since we removed a node, we decrement the length by 1.
                length -= 1;

            } else {

                // Step 8: Add unique value to set.
                // If the current value is not a duplicate,
                // we add it to the set for future reference.
                values.add(current.value);

                // Step 9: Update 'previous' node.
                // We set 'previous' to the 'current' node, as we
                // move forward in the list.
                previous = current;
            }

            // Step 10: Move to the next node.
            // We update 'current' to point to the next node in the list,
            // continuing our iteration.
            current = current.next;
        }
    }
}




