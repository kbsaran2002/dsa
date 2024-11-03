package com.sar.personal;

public class DoublyLinkyList {

     class Node {
       Node prev;
        Node next;
        int data;
        Node (int data ) {
            this.data = data;
        }

    }
     Node head;
     Node last;

    private void add(int a) {
        Node nd = new Node(a);

        if (head == null) {
            head = nd;
        } else {
            Node tailNode = getTailNode(head);
            tailNode.next = nd;
            nd.prev = tailNode;
        }
        last = nd;
    }

    Node getTailNode(Node head) {
        if (head.next == null) {
            return head;
        }

       // Node current = head.next;
      //  while (current.next != null) {
     //       current = current.next;
       // }
        return last;
    }

    boolean containsValue() {
        return head != null && last != null;
    }

    Object pop() {
        int rtn = head.data;
        head = head.next;
        return rtn;
    }

    Object popy() {
        int rtn = last.data;
        last = last.prev;
        return rtn;
    }

    public static void main(String[] args) {

        DoublyLinkyList ll = new DoublyLinkyList();
        ll.add(5);
        ll.add(15);
        ll.add(25);
        ll.add(35);
        ll.add(45);

        while (ll.containsValue()) {
            System.out.println((int) ll.popy());
        }

    }
}
