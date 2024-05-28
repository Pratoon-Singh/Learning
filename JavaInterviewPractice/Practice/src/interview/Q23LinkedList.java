package interview;

public class Q23LinkedList {
    // one way linked list
    Node head;
    Node tail;
    int size;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // create an LL

    Q23LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // to print linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    // to add in last
    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // get tail
    public int getTail() {
        return tail.value;
    }

    // get head
    public int getHead() {
        return head.value;
    }

    // get size
    public int getSize() {
        return size;
    }

    // add at first
    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // remove first
    public void removeFirst() {
        Node temp = head;
        head = temp.next;
        size--;
    }

    // remove last
    public void removeLast() {
        Node temp = head;
        Node previous = head;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        tail = previous;
        tail.next = null;
        size--;
    }


    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > size) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == size ) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;

    }
    public boolean remove(int index){
        if(index<0||index>size) return false;
        if(index==0){
            removeFirst();
            return true;
        }
        if(index == size){
            removeLast();
            return  true;
        }

        Node temp = get(index);
        Node previous = get(index-1);
        previous.next = temp.next;
         temp.next = null;
         size--;
         return true;

    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail= temp;
        Node after = temp.next;
        Node before = null;

        while(after!= null){
            after=temp.next;
            temp.next=before;
            before = temp;
            temp=after;
        }
    }


}

    class Main {
        public static void main(String[] args) {
            Q23LinkedList linkedList = new Q23LinkedList(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.prepend(9);
//        linkedList.print();



//        linkedList.removeLast();
//        linkedList.print();

//        System.out.println(" Tail " + linkedList.getTail());
//        System.out.println(" Head " + linkedList.getHead());
//        System.out.println(" Size " + linkedList.getSize());



            linkedList.insert(linkedList.getSize(), 11);
//            linkedList.remove(5);
            linkedList.print();
//            System.out.println("\n"+linkedList.getSize());
            linkedList.reverse();

            linkedList.print();
        }
    }
