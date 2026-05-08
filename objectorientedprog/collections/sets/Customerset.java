package com.java2.objectorientedprog.collections.sets;

import com.java2.objectorientedprog.comparator.CustomerIdAscComparator;
import com.java2.objectorientedprog.comparator.CustomerIdDecComparator;
import com.java2.objectorientedprog.comparator.CustomerNameComparator;
import com.java2.objectorientedprog.model.Customer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Customerset {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(6699)
                 .setAge(18)
                 .setName("pranay")
                 .setAddress("HYD");
        Customer customer2=new Customer();
        customer2.setId(6600)
                .setName("vaishnavi")
                .setAge(60)
                .setAddress("NLG");
        Customer customer3=new Customer();
        customer3.setId(6690)
                .setName("samjordan")
                .setAge(24)
                .setAddress("Mushrambagh");
        Customer customer4=new Customer();
        customer4.setId(6699)
                .setName("pranay")
                .setAge(18)
                .setAddress("HYD");
        Set<Customer> cos=new TreeSet<>();
        cos.add(customer1);
        cos.add(customer2);
        cos.add(customer3);
        cos.add(customer4);
        System.out.println("customer data is : "+cos);
        System.out.println(cos.size());



    }
}
