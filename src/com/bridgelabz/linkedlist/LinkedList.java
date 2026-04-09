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

    // UC5 Pop Method (Delete First Node)
    public T pop() {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        T poppedData = head.data;
        head = head.next;

        return poppedData;
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