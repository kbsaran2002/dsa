package com.kb.sar.java.strings;

import java.util.HashSet;

public class SubSet {

    static HashSet<String> hs = new HashSet<>();

    public static void main(String[] args) {
        String st= "arin";
        printSubSets(st,"{");
        System.out.println(hs);
    }

    static void printSubSets(String st,String sol){

        if (st.length() == 0 ) {
           // System.out.println(sol);
            hs.add(sol+"}");
            return;
        }

       String newST =  st.substring(1);
       printSubSets(newST,sol+st.charAt(0));
       printSubSets(newST,sol);

    }
}
