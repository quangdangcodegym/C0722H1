package com.codegym.myarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Huy");
        list.add("Nhat");

        Collection<String> l1 = new ArrayList<>();
        l1.add("Sang");
        l1.add("Truc");
        list.addAll(l1);




        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };
        //Consumer<String> consumer1 = new MyConsumer();
        list.forEach(consumer);



    }
}
