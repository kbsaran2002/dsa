package com.kb.sar.java.enums;

public enum Colors {



    RED("redd") {
        public void printColor(){
            System.out.println("i am red in color");
            memberColor = "red";
        }

    },

     BLUE("bluee") {
        public void printColor(){
            System.out.println("i am blue in color");
            
        }
    };

    Colors(String c){
        memberColor = c;
    }
    String memberColor;

    public abstract void printColor();
}
