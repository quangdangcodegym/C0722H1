package com.codegym.comparable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Kiểu dữ liệu mới Rectangle
        // r là 1 biến
        // new Rectangle()

/*
        Rectangle r = new Rectangle();

        Rectangle rectangles[] = new Rectangle[3];
        rectangles[0] = new Rectangle(12, 24, true, "blue");
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(24, 56);


        Rectangle [] rectangles1 = new Rectangle[3];
        rectangles1[0] = new Rectangle(12, 24, true, "blue");
        rectangles1[1] = new Rectangle();
        rectangles1[2] = new Rectangle(24, 56);
        rectangles1[3] = new Rectangle(24, 56);
        rectangles1[4] = new Rectangle(24, 56);
        System.out.println("Pre- sorted");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        //Comparator rectangleComparator = new RectangleComparator();
        //Arrays.sort(rectangles, rectangleComparator);

        //Arrays.sort(rectangles);

//        Arrays.sort(rectangles, (r1, r2) -> {
//            if (r1.getArea() > r2.getArea()) return 1;
//            else if (r1.getArea() < r2.getArea()) return -1;
//            else return 0;
//        });
//
//        System.out.println(" After = sorted");
//
//        for (Rectangle rectangle : rectangles) {
//            System.out.println(rectangle);
//        }

            Rectangle r = new Rectangle(){
                @Override
                public String toString() {
                    return "Square{" +
                            "width=" + width +
                            ", height=" + height +
                            " area " + getArea() +
                            '}';
                }
            };
        System.out.println(r.toString());*/


        //Arrays.sort(Objects[] a);
        //Arrays.sort(T[], Comparator<T>);

//        Rectangle rectangles[] = new Rectangle[3];
//        rectangles[0] = new Rectangle(12, 24, true, "blue");
//        rectangles[1] = new Rectangle();
//        rectangles[2] = new Rectangle(24, 56);
//
//        for (int i = 0; i < rectangles.length; i++) {
//            System.out.println(rectangles[i].toString());
//        }
//        //int [] arr = {4,5, 6}; // int, float , double
//
//        //int [] arr1 = {"Thi","Han", "Quang"};
//
//        //Arrays.sort(rectangles);
//        // Phai overide lai ham compareTo cua doi tuong Rectangle
//        //Arrays.sort(rectangles);
//
//        // C2:
//        Comparator<Rectangle> comparator = new Comparator<Rectangle>() {
//            @Override
//            public int compare(Rectangle o1, Rectangle o2) {
//                if (o1.getArea() > o2.getArea()) return 1;
//                else if (o1.getArea() < o2.getArea()) return -1;
//                else return 0;
//
//            }
//        };
//
//
//        RectangleComparator comparator1 = new RectangleComparator();
//
//        Arrays.sort(rectangles, comparator1);
//
//
//        for (int i = 0; i < rectangles.length; i++) {
//            System.out.println(rectangles[i].toString());
//        }
        //System.out.println(a.toString());
        // Button, animal, product
        Button b1 = new Button();
        b1.setSize(300, 500);

        Button b2 = new Button();
        b2.setSize(400, 400);

        Button b3 = new Button();
        b3.setSize(100, 100);

        /*List<Button> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);*/
        Button [] list1 = {b1, b2, b3};


        //Arrays.sort(list1);

        ButtonComparator a = new ButtonComparator();
        Arrays.sort(list1, a);

        for (int i = 0; i < list1.length; i++) {
            System.out.println("Width: " + list1[i].getSize().getWidth() + " Height: " + list1[i].getSize().getHeight());
        }
    }
}
