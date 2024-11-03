package com.kb.sar.java.enums;

public class SingletonTest {

    public static void main(String[] args) {
        Sngltn sgl = Sngltn.INSTANCE;
        //sgl.setValue(5);
        System.out.println(sgl.getValue());

        Sngltn sgl2 = Sngltn.INSTA2;
        System.out.println(sgl2.getValue());

        for(Sngltn s:Sngltn.values()){
            System.out.println(s);
        }


    }

}
