package com.codegym.compare;

import com.sun.source.doctree.UnknownBlockTagTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 10.0);
        Rectangle r2 = new Rectangle(50.0, 10.0);
        Rectangle r3 = new Rectangle(30.0, 10.0);
        Rectangle r4 = new Rectangle(90.0, 10.0);
        Rectangle r5 = new Rectangle(60.0, 10.0);

        Rectangle[] list = {r1, r2, r3, r4, r5};
//        Arrays.sort(list);
        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(list, rectangleComparator);

        Arrays.stream(list).forEach(rectangle -> {
            System.out.println(rectangle);
        });


//        System.out.println(r1.hashCode());


    }
}
