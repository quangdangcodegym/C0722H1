package com.codegym.colorable;

public class Rectangle extends Shape{
     private double width  = 0;
     private double height = 0;

    public Rectangle()
    {
        System.out.println("Instance Rectangle");
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Instance Rectangle 2 param");
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
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

    @Override
    public String getColor() {
        return "Mau: " + super.getColor();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        String s = this.getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(s);
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                super.toString() +
                " Rectangle Area " + getArea()
                + "Perimeter " + getPerimeter() +
                '}';
    }
}
