package com.java2.objectorientedprog.encapulaction.p2;

import com.java2.objectorientedprog.encapulaction.p1.A;

public class Y extends A {
//    int value=0;
    public static void main(String[] args) {
        A a;
        a=new A();
        a.m1();
        Y y;
        y=new Y();
        System.out.println("value is protected so accessed using sub class object : "+y.value);
//        System.out.println();
    }
}
