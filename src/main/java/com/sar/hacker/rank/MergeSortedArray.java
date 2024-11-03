package com.sar.hacker.rank;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int a[] = { 2, 4, 7, 9 ,10, 13, 15 , 21,23};
        int b[] = {3, 5, 6 , 8,19 , 25};
        int[] c = new int[a.length+b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i <= a.length-1) {

            while (j <= b.length-1) {
                if (i > a.length-1) {
                    c[k] = b[j];
                    j++;
                    k++;
                }
                else {
                    if (a[i] <= b[j]) {
                        c[k] = a[i];
                        i++;
                        k++;
                    } else {
                        c[k] = b[j];
                        j++;
                        k++;
                    }
                }
            }

            if (i <= a.length-1) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        Arrays.stream(c).forEachOrdered(l-> System.out.print(l+" "));
    }
}
