package com.java2.objectorientedprog.streams;

import java.io.IOException;
import java.util.List;

public class EmployeMain {
    public static void main(String[] args) throws IOException {
        CsvReader2 reader=new CsvReader2();
        List<Employes> employesList=reader.getemployesfromcsv();
        System.out.println(employesList);
        List<Employes> filemployes=employesList.stream().filter(employes -> (employes.getAddress().equals("Hyderabad"))).toList();
        System.out.println(filemployes);
        System.out.println(filemployes.size());
        List<Employes> youngemp=employesList.stream().filter(employes -> employes.getAge()<25).toList();
        System.out.println(youngemp);
        System.out.println(youngemp.size());
        List<Employes> Employesnamessorted=employesList.stream().sorted((e1,e2)->CharSequence.compare(e1.getName(), e2.getName())).toList();
        System.out.println(Employesnamessorted);
      //  List<String> EmpNames=employesList.stream().map(employes -> employes.getName()).toList();
        List<String> EmpNames=employesList.stream().map(Employes::getName).toList();
        System.out.println(EmpNames);



    }
}
