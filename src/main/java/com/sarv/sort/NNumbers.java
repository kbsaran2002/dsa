package com.sarv.sort;

import java.util.ArrayList;

public class NNumbers {

    public static void main(String[] args) {
        getNumbers(0,1,15);
    }

    static void getNumbers(int b1,int b2,int k){

        ArrayList<Integer> slate = new ArrayList<Integer> ();
        getNumberSeriesHelper(b1,b2,k,slate);
        System.out.println(slate);

    }

    static void getNumberSeriesHelper(int b1, int b2, int k, ArrayList<Integer> slate){

        if (slate.size() == k)
        {
            return;
        }

        if (slate.isEmpty()) {
            slate.add(b1);
            slate.add(b2);
            getNumberSeriesHelper(b2,b2+b1,k,slate);
        }
        else {
            slate.add(b2);
            getNumberSeriesHelper(b2,b2+b1,k,slate);
        }



    }

}
