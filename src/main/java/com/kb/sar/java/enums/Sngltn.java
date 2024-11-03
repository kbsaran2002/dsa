package com.kb.sar.java.enums;



public enum Sngltn {

    INSTANCE(3),
    INSTA2(4);

    Sngltn(int a){
        this.value = a;
    }
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
