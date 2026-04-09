package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        list.insertAfterNode(30, 40);

        System.out.println("Before delete:");
        list.printList();

        list.delete(40);

        System.out.println("After delete:");
        list.printList();

        System.out.println("Size: " + list.size());
    }
}