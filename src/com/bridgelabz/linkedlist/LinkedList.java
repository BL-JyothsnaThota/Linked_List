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

    public Node<T> search(T key) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // UC8
    public void insertAfterNode(T key, T newData) {
        Node<T> currentNode = search(key);

        if (currentNode == null) {
            System.out.println("Value " + key + " not found");
            return;
        }

        Node<T> newNode = new Node<>(newData);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // UC9 Delete by key
    public void delete(T key) {

        if (head == null) return;

        // Case 1: head is the key
        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;

        // Find previous node of the key
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        }

        // If key found
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value " + key + " not found");
        }
    }

    // UC9 Size method
    public int size() {

        int count = 0;
        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
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