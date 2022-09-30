package com.codegym.mylist;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private int amount;

    public Product(){}
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + "'" +
                ", price=" + price +
                ", amount=" + amount +
                '}' + super.toString();
    }


    @Override
    public int compareTo(Product p2) {
        if (this.getPrice() > p2.getPrice()) {
            return 1;
        } else {
            if (this.getPrice() == p2.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    @Override
    public boolean equals(Object product) {
        Product p1 = (Product) product ;
        if(this == product){
            return true;
        }else{
            if(this.getName().equalsIgnoreCase(p1.getName())&&this.amount==p1.getAmount() && this.getPrice()==p1.getPrice()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }
}
