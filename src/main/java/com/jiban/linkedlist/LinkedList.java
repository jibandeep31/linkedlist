package com.jiban.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedList {

    private static final Logger logger = Logger.getLogger(LinkedList.class.getName());

    private LinkedListNode head;
    private int length;

    public int getLength() {
        return length;
    }

    public LinkedList() {
        this.head = null;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public void insertNode(int data) {
        if (this.head == null) {
            logger.log(Level.INFO, "The linked list is empty.");
            LinkedListNode node = new LinkedListNode(data);
            this.head = node;
            logger.log(Level.INFO, "The node is inserted at the head.");
            return;
        }

        LinkedListNode current = this.head;
        while (current != null) {
            if (current.getNext() == null) {
                LinkedListNode node = new LinkedListNode(data);
                current.setNext(node);
                logger.log(Level.INFO, "The node is inserted in the linked list.");
                length++;
                break;
            }
            current = current.getNext();
        }
        return;
    }
    
    public void deleteNode(int data) {
        if(this.head == null) {
            logger.log(Level.SEVERE, "The linked list is empty.");
            return;
        }
        
        LinkedListNode current = this.head;
        
        if(current.getData() == data) {
            logger.log(Level.INFO , "The first node is deleted.");
            this.head = current.getNext();
            current.setNext(null);
            return;
        }
        
        while(current != null) {
            if(current.getNext() != null && current.getNext().getData() == data) {
                LinkedListNode temp = current.getNext();
                current.setNext(temp.getNext());
                temp.setNext(null);
                logger.log(Level.INFO , "The node is deleted.");
                return;
            }
            
            current = current.getNext();
        }
        
    }

    public void displayList() {
        if (this.head == null) {
            logger.log(Level.INFO, "The linked list is empty.");
        }
        LinkedListNode current = this.head;
        List<Integer> items = new ArrayList<Integer>();
        while (current != null) {
            items.add(current.getData());
            current = current.getNext();
        }
        logger.log(Level.INFO, "The list of data present in linked list are : {0}", items);
    }

}
