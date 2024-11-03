package com.sar.personal;

import java.util.*;

public class InterviewBasics {

    public static void main(String[] args) {

        System.out.println("primitive data types ");
        int[] x = {5,5,6,6,6,6};
        int[] y = new int[0];
        y[0] = 5;
        y[1] = 6;
        char[] c = new char[0] ;
        c[0] = 's';
        c[1] = 'a';
        c[2] = 'r';
        c[3] = 'a';
        Arrays.sort(c);
        String s = c.toString();

        char[] xc = s.toCharArray();
        int ln = xc.length;

        System.out.println("AutoBox data types");

        Character[] carr = new Character[0];
        carr[0] = 's';
        carr[1] = 'a';
        Arrays.sort(carr);

        List<Character> lcr = new ArrayList<>();
        lcr = Arrays.asList(carr);

        Integer[] iarr = new Integer[0];
        Integer[] iarr1 = {3,5,5,5,5,5};
        iarr[0] = 4;
        iarr[1] = 6;



        List<Integer> lint = new ArrayList<>();
        lint =  Arrays.asList(iarr);



        Set<Integer> seti = new HashSet<>(lint);

        boolean bl = seti.add(iarr[0]);
        boolean b2 = seti.add(iarr[1]);

        System.out.println("double , long ");






    }
}
