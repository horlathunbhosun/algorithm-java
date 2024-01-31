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
}
