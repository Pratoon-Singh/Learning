package interview;

public class Q26DoublyLL {

    class Node {
        int value ;
        Node next ;
        Node previous;

        Node(int value){
            this.value= value;
        }
    }

    Node head ;
    Node tail;
    int length;

    Q26DoublyLL(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public  void  print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        System.out.println("Head :- " + head.value);
    }

    public void getTail(){
        System.out.println("Tail :- " + tail.value);
    }

    public void getLength(){
        System.out.println("Length :- " + length);
    }


    public  void append (int value){
        Node node = new Node(value);
        if(length==0){
            head=node;
            tail=node;
        }
        else {
            tail.next= node;
            node.previous=tail;
            tail = node;
        }
        length++;
    }


    public Node removeLast(){
        Node temp = tail;
        if(length == 0 ) return null;
        if(length == 1  ){
            head = null;
            tail= null;
        }else{
        tail = tail.previous;
        tail.next= null;
        temp.previous=null;
        }
        length--;
        return temp;
    }

    public  void prepend(int value){
        Node node = new Node(value);
        if(length==0){
            head=node;
            tail=node;
        }else {
            node.next = head;
            head = node ;
            node.previous= null;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if(length==0)return null;
        if(length==1){
            head = null;
            tail = null;
            return temp;
        }
        head = temp.next;
        head.previous=null;
        temp.next= null;
        length--;
        return temp;
    }

    public Node get(int index){

        if (index < 0 || index >= length) return null;
        Node temp = head;
        if(index<length/2){
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }}
        else {
            temp = tail;
            for (int i = length-1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    public boolean set(int index ,int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public void insert(int index , int value){
        Node newNode= new Node(value);
        Node n = get(index);
        Node n1 = get(index-1);

        newNode.next =n;
        n.previous = newNode;
        n1.next=newNode;
        newNode.previous =n1;
        length++;
    }

    public Node remove(int index){
        Node temp = get(index);
        Node before = temp.previous;
        Node after = temp.next;

        before.next=after;
        after.previous = before;
        temp.next=null;
        temp.previous=null;
        return temp;
    }

    public Node remove1(int index){
        Node temp = get(index);
        temp.next.previous = temp.previous;
        temp.previous.next=temp.next;
        temp.next=null;
        temp.previous=null;
        length--;
        return temp;
    }
}

class Double{
    public static void main(String[] args) {

        Q26DoublyLL doublyLL = new Q26DoublyLL(7);
//        doublyLL.print();
//        doublyLL.getHead();
//        doublyLL.getTail();
//        doublyLL.getLength();

        doublyLL.append(2);
        doublyLL.append(12);
        doublyLL.append(23);
        doublyLL.append(33);

        doublyLL.print();
        System.out.println(doublyLL.remove1(2).value);
        doublyLL.print();
    }
}
