package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Before pop:");
        list.printList();

        list.pop();

        System.out.println("After pop:");
        list.printList();
    }
}