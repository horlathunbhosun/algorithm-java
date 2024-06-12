package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // This is a Node class. It is a blueprint for a Node object.
     class Node {

        // This is a field. It is a variable that is declared inside a class.
        int value;

        // This is a reference to another Node object.
        Node next;

        // This is a constructor. It is a special method that is called when a new
        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value) {
      Node newNode = new Node(value);
      head = newNode;
      tail = newNode;
      length = 1;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;

        }
        length++;
    }



   public Node removeLast(){
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

   public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }

    }

    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Tail: "+tail.value);
    }

    public void getLength() {
        System.out.println("Length: "+length);
    }


}
