package com.codegym.colorable;

import com.codegym.logger.Log;

import java.io.IOException;
import java.util.logging.Level;

public class TestShape {
    public static void main(String[] args) throws IOException {

        Log my_log = new Log("log.txt");
        my_log.logger.setLevel(Level.ALL);

        Shape shape = new Rectangle(4.5, 4.5);
        System.out.println(shape.getPerimeter());
        System.out.println(shape);

        Object shape1 = new Rectangle(4.5, 4.5);
        //System.out.println(shape1.getPerimeter());

        // tạo mảng chứa các đối tượng
        /*Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(12);
        shapes[2] = new Rectangle(4,6);
        Shape s = new  Square(12);*/

       /* Shape shape = new Circle(5);
        System.out.println(shape.getColor());*/


//        Shape square = new Square(12);
//        System.out.println(square.getColor());
        // in ra mảng + diện tích

        // Class vs object
        // instances
        // Contructor
        // Object  => toString()
        // Shape extens Object


        // com.codegym.colorable.Shape@2a2d45ba
        // Shape lon
        //
        //int float
//        int a = 5;
//        float b = a;
//        Shape shape = new Shape();
//
//
//        Rectangle rectangle = new Rectangle();
//        shape = rectangle;
//        shape = new Circle();


    }
}
