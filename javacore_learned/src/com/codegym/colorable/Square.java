package com.codegym.colorable;

public class Square extends Rectangle implements Colorable{
    private double side;

    public Square() {
        super(34,78);
        super.getArea();
        System.out.println("Instance Square");
    }
    public Square(double side) {
        super(23, 45);
        this.side = side;
    }



    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                ", side=" + side +
                " Area " + getArea()
                + " Perimeter " + getPerimeter() +
                '}';
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
