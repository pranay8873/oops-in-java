package com.java2.objectorientedprog.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static jdk.jpackage.internal.WixAppImageFragmentBuilder.Component.File;

public class Csvreader {
    public List<Product> getProductsFromCsv() throws IOException {
        File file=new File("C:\\Users\\USER\\Downloads\\product_details_50_entries.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));
        br.readLine();
        String productdata= br.readLine();
        List<Product> products=new ArrayList<>();
        while (productdata!=null){
            String[] data=productdata.split(",");
            Product product=new Product();
            product.setProductId(Integer.parseInt(data[0]));
            product.setProductName(data[1]);
            product.setMaxRetailPrize(Integer.parseInt(data[2]));
            product.setDiscountper(Integer.parseInt(data[3]));
            product.setCategory(data[4]);
            products.add(product);
            productdata=br.readLine();
        }
        return products;


    }
}
