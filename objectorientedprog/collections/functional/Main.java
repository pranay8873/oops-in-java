package com.java2.objectorientedprog.collections.functional;

public class Main{
//    @Override
//    public void great() {
//        System.out.println("Hi from greating interface");
//    }
    // this works for implementing interface i.e;Implement Main with Greeting

    public static void main(String[] args) {
//        Main m1=new Main();
//        m1.great();
        Greeting greeting=new Greeting() {
            public void great() {               //performs same operation without implementing interface
                System.out.println("hi from greating interface");

            }
        };
        //greeting.great();
        Greeting greating2=()-> System.out.println("Hi from interface");
        greating2.great();


    }

//    @Override
//    public void great() {
//
//    }
}
