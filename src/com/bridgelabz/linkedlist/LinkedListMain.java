package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(70);

        // Insert 30 after 56
        list.insertAfter(56, 30);

        list.printList();
    }
}