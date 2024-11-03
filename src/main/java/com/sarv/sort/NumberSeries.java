package com.sarv.sort;

public class NumberSeries
{

    public static void main(String[] args) {

        getNumberSeries(2, 4, 5);
    }

    static void getNumberSeries(int b1, int b2, int n) {

        if (n==1) {
            System.out.println(b1);
        }

        else {
            getNumberSeries(b2, b2 + b1, n - 1);
        }
    }

}
