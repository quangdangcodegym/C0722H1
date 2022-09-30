package com.codegym.mylist;

import java.util.Comparator;

// Tạo 1 class triển khai interface Comparator
public class MyComparatorImplAmount implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getAmount()>p2.getAmount()){
            return 1;
        }else{
            if(p1.getAmount()==p2.getAmount()){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
