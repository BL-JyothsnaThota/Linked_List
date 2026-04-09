package com.bridgelabz.linkedlist;
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        Node<Integer> result = list.search(30);

        if (result != null) {
            System.out.println("Found: " + result.data);
        } else {
            System.out.println("Not Found");
        }
    }
}