package datastructures.linkedlist;

import java.io.FileOutputStream;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.set(1,4);


      myLinkedList.printList();


    }





}
