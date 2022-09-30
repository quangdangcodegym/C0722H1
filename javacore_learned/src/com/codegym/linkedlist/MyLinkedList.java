package com.codegym.linkedlist;

public class MyLinkedList {
    private Node head;
    private int numNodes = 0;


    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
