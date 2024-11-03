package com.sar.personal;

import java.util.ArrayList;

public class Stacky {

    ArrayList<Integer>  al;

    Stacky(int size) {
        al = new ArrayList<>(size);
    }


    private synchronized void add(int a) {
        al.add(a);
    }

    private synchronized int pop() {
       int x=  al.get(al.size()-1);
       al.remove(al.size()-1);
       return x;
    }

    private int popy() {
        int x=  al.get(0);
        al.remove(0);
        return x;
    }

    public static void main(String[] args) {

        Stacky st = new Stacky(4);
        st.add(1);
        st.add(3);
        st.add(5);
        st.add(7);

        System.out.println(st.popy());
        System.out.println(st.popy());
        System.out.println(st.popy());
        System.out.println(st.popy());



    }
}
