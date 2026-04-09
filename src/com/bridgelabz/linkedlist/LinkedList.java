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

    // UC8 Insert After Using Search
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

    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}