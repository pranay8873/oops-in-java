package com.java2.objectorientedprog.exception;

import java.util.Scanner;

public class ExceptionHandling {

    int add(){
        try {
            System.out.println("Enter 2 numbers to perform addition ");
            System.out.println("a : ");
            Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            System.out.println("b : ");
            int n2= sc.nextInt();
            int add=0;
            add=n1+n2;
            return add;
        } catch (Exception e) {
            System.out.println("error occurred : "+e);
            System.out.println("Check inpunt and provide int format.");
            add();
           // throw new RuntimeException(e);
        }finally {
            System.out.println("add method called...!");
            return 0;
        }



    }

    public static void main(String[] args) {

       // Scanner sc=new Scanner(System.in);
        ExceptionHandling exe=new ExceptionHandling();
//        int a,b;
//
//       try {
//           a= sc.nextInt();
//           b= sc.nextInt();
//           n=exe.add(a,b);
//           System.out.println(n);
//       } catch (Exception e) {
//           System.out.println("Exception Occurred : "+e);
//          // throw new RuntimeException(e);
//       }finally {
//
//       }
        int addition;
        addition=exe.add();
        System.out.println(addition);


    }
}
