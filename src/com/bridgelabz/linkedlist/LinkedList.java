package com.bridgelabz.linkedlist;
public class LinkedList<T> {

    Node<T> head;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // UC5 Pop (delete first)
    public T pop() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        T data = head.data;
        head = head.next;
        return data;
    }

    // UC6 Pop Last (delete last)
    public T popLast() {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        // Only one node
        if (head.next == null) {
            T data = head.data;
            head = null;
            return data;
        }

        // Traverse to second last node
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        T data = temp.next.data; // last node data
        temp.next = null;        // remove last node

        return data;
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