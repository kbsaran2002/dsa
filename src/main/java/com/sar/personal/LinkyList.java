package com.sar.personal;

class Node {

    Node next;
    int data;
    Node (int data ) {
        this.data = data;
    }

}

public class LinkyList {
    Node head;

    private void add(int a) {
        Node nd = new Node(a);

        if (head == null) {
            head = nd;
        } else {
            Node tailNode = getTailNode(head);
            tailNode.next = nd;
        }
    }

    Node getTailNode(Node head) {
        if (head.next == null) {
            return head;
        }

        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    boolean containsValue() {
        return head != null;
    }

    Object pop() {
        int rtn = head.data;
        head = head.next;
        return rtn;
    }

    public static void main(String[] args) {

        LinkyList ll = new LinkyList();
        ll.add(5);
        ll.add(15);
        ll.add(25);
        ll.add(35);
        ll.add(45);

        while (ll.containsValue()) {
            System.out.println((int) ll.pop());
        }

    }
}
