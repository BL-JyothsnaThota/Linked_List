package com.bridgelabz.linkedlist;
public class LinkedList<T> {

    Node<T> head;

    // UC3 Append Method (Insert at End)
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Add new node at end
        temp.next = newNode;
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