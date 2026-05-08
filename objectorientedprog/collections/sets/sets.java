package com.java2.objectorientedprog.collections.sets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("hi");
        set.add(100);
        set.add("pranay");
        set.add(20);
        set.add("hi");
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr2=set.iterator();
        while (itr2.hasNext()){
            if (itr2.next().equals("hi")) {
                System.out.println("hi is present in set : " + true);
            }
            else {
                System.out.println("hi is not present");
            }
        }
//        Set<String> names = new HashSet<>();
//
//        names.add("Pranay");
//        names.add("Akash");
//        names.add("Santosh");
//        names.add("Pranay");
//        names.add(20);error

//        System.out.println(names);
        Set<String> names=new HashSet<>();
        names.add("pranay");
        names.add("cherry");
        names.add("vaishnavi");
        names.add("deepika");
        System.out.println(names);
    }

}