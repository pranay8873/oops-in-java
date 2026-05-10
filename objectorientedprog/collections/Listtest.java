package com.java2.objectorientedprog.collections;

import com.java2.objectorientedprog.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Listtest {
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
        List<Customer> customers=new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers.get(0));
        for (Customer customer : customers){
            System.out.println(customer);
        }
        for (Customer customer:customers){
            System.out.println(customer.getId());
        }


    }
}
