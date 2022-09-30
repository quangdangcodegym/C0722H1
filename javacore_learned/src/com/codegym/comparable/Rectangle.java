package com.codegym.comparable;

public class Rectangle extends Shape{
    protected double width,height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height, boolean filled, String color) {
        this.width = width;
        this.height = height;
        this.filled = filled;
        this.color = color;
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
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                " area " + getArea() +
                '}';
    }



//    @Override
//    public int compareTo(Rectangle o) {
//        if (this.getArea() > o.getArea()) return 1;
//        else if (this.getArea() < o.getArea()) return -1;
//        else return 0;
//    }
    //    @Override

}