package com.java2.objectorientedprog.collections;

import com.java2.objectorientedprog.model.Customer;

import java.util.*;

public class Maptest {
    public static void main(String[] args) {
        Map<Integer, Customer> customerMap=new LinkedHashMap<>();
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
        customerMap.put(customer1.getId(),customer1);
        customerMap.put(customer2.getId(),customer2);
        customerMap.put(customer3.getId(),customer3);
        customerMap.put(customer4.getId(),customer4);
        System.out.println(customerMap);

    }
}
