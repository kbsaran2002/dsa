package com.sar.personal;

import java.util.*;

public class Solution {

    static int getOneFirstOccur(int[] ai) {
        int cnt = 0;

        for (int ig : ai) {
            cnt ++;
            if (ig ==1 ){
                return cnt-1;
            }
         //   System.out.print(" "+ig);
        }
        return 0;
    }

    public static void main(String[] args) {

        Integer[] ai ={0,1,0,0,0,0,1,1,1,1,1} ;

      //  List<Integer> l = new ArrayList<Integer>();
       // l =  Arrays.asList(ai);

        Arrays.sort(ai);


        List<Integer> l = new ArrayList<Integer>();
        l = Arrays.asList(ai);
        Set<Integer> s = new HashSet<>(l);

        System.out.println(s);



      //  Integer[] bi = (Integer[]) l.toArray();

       // System.out.println("Count of 0 "+getOneFirstOccur(ai));
     //   int d = ai.length-getOneFirstOccur(ai);
     //   System.out.println("Count of 1 "+d);

    System.exit(0);



        HashMap<String,String> h = new HashMap();
        String a = "key1";
        String b = "val1";

        h.put(a,b);
        h.put("key2","val2");


        for (String key : h.keySet()) {

            System.out.println("Key "+key);
            System.out.println("value "+h.getOrDefault(key,"defaddd"));
            System.out.println("value "+h.getOrDefault(key+'h',"defaddd"));


        }
        
    }
}
