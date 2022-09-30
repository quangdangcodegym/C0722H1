package com.codegym.polymorphism;

import com.codegym.colorable.Rectangle;
import com.codegym.colorable.Shape;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new com.codegym.colorable.Rectangle(4.5, 4.5);
//        System.out.println(shape.getPerimeter());
//        System.out.println(shape);
//
//        Object shape1 = new Rectangle(4.5, 4.5);
//        //System.out.println(shape1.getPerimeter());
//
//        Rectangle rectangle = new Rectangle(5,6);
//        printObject(rectangle);

        Shape shape = new Rectangle(4.5, 4.5);
        Object shape1 = shape;
        System.out.println(shape);
        System.out.println(shape1);

        shape.getPerimeter();
        ((Shape) shape1).getPerimeter();

    }

    public static void printObject(Object obj) {
        System.out.println(obj.toString());
    }
}
