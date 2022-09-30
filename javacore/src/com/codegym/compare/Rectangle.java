package com.codegym.compare;

import java.util.Comparator;

public class Rectangle extends Shape {
    protected double width, height;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return  this.height*this.width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else{
            Rectangle r = (Rectangle) obj;
            if(this.getArea() == r.getArea()){
                return true;
            }
        }
        return false;
    }


//    @Override
//    public int compareTo(Rectangle o) {
//        if(this.getArea()>o.getArea()){
//            return 1;
//        }else{
//            if(this.getArea()<o.getArea()){
//                return -1;
//            }
//        }
//        return 0;
//    }
}

