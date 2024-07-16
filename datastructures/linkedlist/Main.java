package datastructures.linkedlist;

import java.io.FileOutputStream;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.set(1,4);
        //System.out.println(myLinkedList.get(2).value);
        //myLinkedList.prepend(1);

      myLinkedList.printList();

//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast().value);
//        System.out.println( myLinkedList.removeLast());
//        myLinkedList.removeLast();
    }





}
