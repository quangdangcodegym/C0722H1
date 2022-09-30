package com.codegym.myarraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    public static int DEFAUL_CAPACITY = 10;
    Object[] elements;
    public MyList(){
        size = 0;
        elements = new Object[DEFAUL_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public boolean add(E e){
        if (size == elements.length) {
            ensureCapacity();
        }
//        elements[size++] = e;
        elements[size] = e;
        size++;
        return true;
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, elements.length*2);
    }


    public void printArray(){
        System.out.println("size: " + size + " Capacity: " + elements.length);
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
