package com.bridgelabz.linkedlist;
public class LinkedList<T> {

    Node<T> head;

    // UC2 Push Method
    public void push(T data) {

        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
    }

    public void printList() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}