package com.java2.objectorientedprog.comparator;

import com.java2.objectorientedprog.model.Customer;

import java.util.Comparator;

public class CustomerIdDecComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getId()-o1.getId();
    }
}
