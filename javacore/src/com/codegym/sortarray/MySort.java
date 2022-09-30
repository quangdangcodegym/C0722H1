package com.codegym.sortarray;

import java.util.Random;

public class MySort {
    private int max = 1000;
    private int min = 0;
    private int [] list;
    public MySort(){
        list = new int[10000000];

        for (int i = 0; i < list.length; i++) {
            int item = (int) Math.random()*(max-min +1 ) + min;
            list[i] = item;
        }
    }

    public MySort(int size) {
        list = new int[size];
        for (int i = 0; i < list.length; i++) {
            int item = (int) Math.random()*(max-min +1 ) + min;
            System.out.println(item);
            list[i] = item;
        }
    }

    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if(list[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }


    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int[] getList() {
        return list;
    }
}
