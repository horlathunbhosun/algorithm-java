package datastructures.linkedlist;

import java.io.FileOutputStream;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.prepend(1);

        myLinkedList.printList();

//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast());
//        myLinkedList.removeLast();
    }





}
