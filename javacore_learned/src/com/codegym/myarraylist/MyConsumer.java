package com.codegym.myarraylist;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Thanh vien lop toi " + s);
    }
}
