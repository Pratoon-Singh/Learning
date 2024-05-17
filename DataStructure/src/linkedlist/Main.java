package linkedlist;

public class Main {
    public static void main(String[] args) {
        MyDemoLinkedList linkedList= new MyDemoLinkedList(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
//        linkedList.printList();
//        System.out.println(linkedList.removelast().value);
//        System.out.println("Removed Last" );
//        System.out.println(linkedList.prepend(7).value);
//        linkedList.prepend(7);
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();

//        linkedList.printList();
//        System.out.println("-------------");
//        System.out.println(linkedList.removeFirst());
//        System.out.println("--------------");
//        System.out.println(linkedList.removeFirst());
//        System.out.println("--------------");
//        System.out.println(linkedList.removeFirst());

//        System.out.println(linkedList.get(0).value);;

//        linkedList.printList();
//        linkedList.set(1,9);
//        System.out.println("After set Method");
//        linkedList.printList();

//        linkedList.printList();
//        linkedList.insert(0,11);
//        linkedList.printList();

//        linkedList.printList();
//        linkedList.remove(1);
//        System.out.println("-----------");
//        linkedList.reverse();

        // create a loop by connecting the tail to the second node
//        linkedList.getTail().next = linkedList.getHead().next;
        linkedList.removeDuplicates();
        linkedList.printList();
    }
}
