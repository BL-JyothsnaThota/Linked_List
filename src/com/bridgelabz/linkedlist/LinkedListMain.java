package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        // Insert 40 after 30
        list.insertAfterNode(30, 40);

        list.printList();
    }
}