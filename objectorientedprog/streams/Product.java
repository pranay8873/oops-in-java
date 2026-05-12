package com.java2.objectorientedprog.streams;

import java.util.Objects;

public class Product {
    int ProductId;
    String ProductName;
    int MaxRetailPrize;
    int Discountper;
    String Category;
    public  Product(){
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getDiscountper() {
        return Discountper;
    }

    public void setDiscountper(int discountper) {
        Discountper = discountper;
    }

    public int getMaxRetailPrize() {
        return MaxRetailPrize;
    }

    public void setMaxRetailPrize(int maxRetailPrize) {
        MaxRetailPrize = maxRetailPrize;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName + '\'' +
                ", MaxRetailPrize=" + MaxRetailPrize +
                ", Discountper=" + Discountper +
                ", Category='" + Category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ProductId == product.ProductId && MaxRetailPrize == product.MaxRetailPrize && Discountper == product.Discountper && Objects.equals(ProductName, product.ProductName) && Objects.equals(Category, product.Category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductId, ProductName, MaxRetailPrize, Discountper, Category);
    }
}
