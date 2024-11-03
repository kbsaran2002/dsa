package com.kb.sar.java.enums;

public class EnumTest {

    public static void main(String[] args) {
         Colors.RED.printColor();
        Colors.BLUE.printColor();

        for (Colors y : Colors.values()){
            System.out.println("enum" + y);
            y.printColor();
        }

       Colors cl1=  Colors.RED;
        Colors cl2=  Colors.BLUE;

        cl1.printColor();
        cl2.printColor();
        System.out.println(cl1.memberColor);
        System.out.println(cl2.memberColor);
    }
}
