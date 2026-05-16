package com.java2.objectorientedprog.streams;

import java.util.Objects;

public class Employes {
    int id;
    String name;
    String address;
    String company;
    int experiance;
    String category;
    String level;
    int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employes employes = (Employes) o;
        return id == employes.id && experiance == employes.experiance && age == employes.age && Objects.equals(name, employes.name) && Objects.equals(address, employes.address) && Objects.equals(company, employes.company) && Objects.equals(category, employes.category) && Objects.equals(level, employes.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, company, experiance, category, level, age);
    }

    @Override
    public String toString() {
        return "CCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", experiance=" + experiance +
                ", category='" + category + '\'' +
                ", level='" + level + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
