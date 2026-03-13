package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(70);

        list.head = first;
        first.next = second;
        second.next = third;

        list.printList();
    }
}