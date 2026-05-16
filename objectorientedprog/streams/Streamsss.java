package com.java2.objectorientedprog.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Streamsss {
    public static void main(String[] args) throws IOException {
        Csvreader reader=new Csvreader();
        List<Product> products=reader.getProductsFromCsv();
        System.out.println(products);
        List<Product> filteredproducts=new ArrayList<>();
        for (Product product:products){
            if (product.getMaxRetailPrize()>=2000 && product.getMaxRetailPrize()<5000){
                filteredproducts.add(product);
            }
        }
        System.out.println(filteredproducts);
        System.out.println(products.size());
        System.out.println(filteredproducts.size());
        List<Product> filteredproduct2=products.stream().filter(product->product.getMaxRetailPrize()>1000 && product.getMaxRetailPrize()<5000).toList();
        //List<Product> filteredproduct2=products.stream().filter(product::getMaxRetailPrize()>1000 && product.getMaxRetailPrize()<5000).toList();

        System.out.println(filteredproduct2);
        System.out.println(filteredproduct2.size());
        List<String> names;
        names=products.stream().map(Product::getProductName).toList();
        System.out.println("product names");
        System.out.println(names);
        List<Product> sortedproducts;
        sortedproducts=products.stream().sorted((p1,p2)-> CharSequence.compare(p1.getProductName(),p2.getProductName())).toList();
        System.out.println("----------------------------------------------p");
        System.out.println(products);
        System.out.println("---------------------------------------------sp");
        System.out.println(sortedproducts);

    }
}
