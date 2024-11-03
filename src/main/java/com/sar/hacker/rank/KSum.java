package com.sar.hacker.rank;

import java.lang.reflect.Array;
import java.util.*;

public class KSum {

    public static void main(String[] args) {
        int[] a = { 5 , 4 , 7,  2 , 6 , 9 , 3 , 12 };
        int k = 2;

        Arrays.sort(a);
        ArrayList<Set> as = new ArrayList<Set>();


        Arrays.stream(a).forEach(k1 -> System.out.print(k1+ ","));

        int start = 0;
        int end = a.length-1;
        int count = 0;

        while (start < end) {

            if (a[start]+a[end] == k ){
                HashSet hs = new HashSet<>();
                hs.add(a[start]);
                hs.add(a[end]);
                as.add(hs);
                start++;
                end--;
                count++;
            }
            else if (a[start]+a[end] < k){
                start++;
            }
            else {
                end --;
            }

        }

        System.out.println("not of k sum pairs " + count);

        for ( Set h :  as) {

            h.stream().forEach(se -> System.out.print(se+ " "));
            System.out.println("");
        }

    }
}
