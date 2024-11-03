package com.sar.personal;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        Test ts = new Test();
        HashMap<String,obj1> hm = new HashMap<>();
        ts.addtoMap(hm,1,"3","4","7");
        ts.addtoMap(hm,2,"4","5","8");
        ts.addtoMap(hm,3, "5","6","9");

        hm.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" --> "+e.getValue()));

    }

    void addtoMap(HashMap<String,obj1> hm,int i, String a, String b , String c) {
        Test.obj1 o =   new Test.obj1(a,b,c);
        hm.put("k"+i,o);
    }

    class obj1 {
        String a;
        String b;
        String c;

        public obj1(String a, String b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }


    }
}
