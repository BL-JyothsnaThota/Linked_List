package com.bridgelabz.linkedlist;
public class LinkedList<T> {

    Node<T> head;

    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        //System.out.println("null");
    }
}