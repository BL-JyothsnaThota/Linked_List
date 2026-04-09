package com.bridgelabz.linkedlist;
public class LinkedList<T> {

    Node<T> head;

    // UC3 Append (reuse)
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

    // UC4 Insert After Given Value
    public void insertAfter(T prevData, T newData) {

        Node<T> temp = head;

        // Search for node with prevData
        while (temp != null && !temp.data.equals(prevData)) {
            temp = temp.next;
        }

        // If node found
        if (temp != null) {
            Node<T> newNode = new Node<>(newData);

            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Value " + prevData + " not found");
        }
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