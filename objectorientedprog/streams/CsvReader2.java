package com.java2.objectorientedprog.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader2 {
    public List<Employes> getemployesfromcsv() throws IOException {
        File file=new File("C:\\Users\\USER\\Downloads\\ccustomer_data.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));

        List<Employes> customers = new ArrayList<>();

        // Skip Header Row
        br.readLine();

        String customerData;

        while ((customerData = br.readLine()) != null) {

            String[] data = customerData.split(",");

            Employes customer = new Employes();

            customer.setId(Integer.parseInt(data[0]));
            customer.setName(data[1]);
            customer.setAddress(data[2]);
            customer.setCompany(data[3]);
            customer.setExperiance(Integer.parseInt(data[4]));
            customer.setCategory(data[5]);
            customer.setLevel(data[6]);
            customer.setAge(Integer.parseInt(data[7]));

            customers.add(customer);
        }

        br.close();

        return customers;

    }

}
