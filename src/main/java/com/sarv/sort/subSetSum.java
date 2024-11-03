package com.sarv.sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class subSetSum {

    static ArrayList<Long> st = new ArrayList<>();


    public static void main(String[] args) {

        ArrayList<Long> arr = new ArrayList<>();
        arr.add(2L);
        arr.add(4L);
        arr.add(8L);


        System.out.println(check_if_sum_possible(arr, 6L));

    }

    static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {

        ArrayList<Long> slate = new ArrayList<>();

        return subsetHelper(arr,0,k,0L);
    }

    static  boolean  subsetHelper(ArrayList<Long> arr,int start,Long k,Long sum) {
        boolean answer = false;

        int len = arr.size();
        int next = start+1;
        Long sumRes = arr.get(start) +sum;
        if (start == len) {
            answer = false;
        }
        else {
            if (sumRes.equals(k)) {
                answer = true;
            } else {
                subsetHelper(arr, next, k, sumRes);
            }
        }
        return answer;
    }

}
