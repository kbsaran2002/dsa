package com.sarv.sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Node {

    int val;
    Node next;

    public Node(int val){
        this.val = val;
        next = null;
    }

}



public class LinkedListMerge {

    public static void main(String[] args) {

        Node head ;
        Node tail;

        head = new Node(5);
        tail = head;

        tail.next = new Node(6);
        tail = tail.next;

        tail.next = new Node(8);
        tail = tail.next;

        tail.next = new Node(9);
        tail = tail.next;

        Node head1 ;
        Node tail1;

        head1 = new Node(3);
        tail1 = head1;

        tail1.next = new Node(4);
        tail1 = tail1.next;

        tail1.next = new Node(7);
        tail1 = tail1.next;

        Node head2 ;
        Node tail2;

        head2 = new Node(1);
        tail2 = head2;

        tail2.next = new Node(2);
        tail2 = tail2.next;


        ArrayList<Node> lists = new ArrayList<>();
        lists.add(head);
        lists.add(head1);
        lists.add(head2);

        Node res =  merge_k_lists(lists);

        printLkList(head);
        printLkList(head1);
        printLkList(head2);
        printLkList(res);
        //printLkList(head1);

    }


    static void printLkList(Node nd)
    {
        while(true)
        {
            System.out.print(nd.val+"-->");
            if (nd.next != null) {
                nd = nd.next;
            }
            else
            {
                break;
            }
        }

        System.out.println();
    }

    static Node merge_k_lists(ArrayList<Node> lists) {
        Node resHead = null;
        Node resTail = null;
        ArrayList<Integer> resArr = new ArrayList<>();

        Set doneSet = new HashSet();
        int i = 0;

        while (doneSet.size() < lists.size() && i < lists.size()){

            Node lln = lists.get(i);

            if (lln != null && ! doneSet.contains(i)) {

                if (resHead == null)
                {
                    resHead = new Node(lln.val);
                    resTail = resHead;
                }
                else
                {
                    resTail.next = new Node(lln.val);
                    resTail = resTail.next;
                }

                lln = lln.next;
                lists.remove(i);
                lists.add(i,lln);

                if (lln == null) {
                    doneSet.add(i);
                }

            }

            if (i == lists.size()-1) {
                i =0 ;
            }
            else if (i < lists.size()-1){
                i++;
            }
        }

        return resHead;
    }



}
