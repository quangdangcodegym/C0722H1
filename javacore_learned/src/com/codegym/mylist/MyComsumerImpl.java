package com.codegym.mylist;

import java.util.function.Consumer;

public class MyComsumerImpl implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        System.out.println(product);
    }
}
