package com.codegym.sortarray;

import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        //MySort mySort = new MySort();
//        MySort mySort = new MySort(10);
//
//        Stopwatch stopwatch = new Stopwatch();
//        stopwatch.start();
//        MySort.binarySearch(mySort.getList(), -100);
////        MySort.linearSearch(mySort.getList(), -100);
//        stopwatch.end();
//        System.out.println("start: " + stopwatch.start() + " end: " + stopwatch.end());


        int[] list = {4, 1, 5};
        int [] list1= Arrays.copyOf(list, list.length*2);

        System.out.println(Arrays.toString(list1));


    }
}
