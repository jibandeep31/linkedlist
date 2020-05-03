package com.jiban.linkedlist;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListOperations {

    private static final Logger logger = Logger.getLogger(LinkedListOperations.class.getName());

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        List<Integer> inputs = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toList());

        performInsertOperation(linkedList, inputs);
        performDisplayOperation(linkedList);
        performDeleteOperation(linkedList, 3);
        performDisplayOperation(linkedList);
    }

    private static void performInsertOperation(LinkedList linkedList, List<Integer> inputs) {
        inputs.stream().forEach(input -> linkedList.insertNode(input));
    }

    private static void performDisplayOperation(LinkedList linkedList) {
        linkedList.displayList();
    }

    private static void performDeleteOperation(LinkedList linkedList, int data) {
        linkedList.deleteNode(data);
    }
}
