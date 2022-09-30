package com.codegym.colorable;

import com.codegym.logger.Log;

import java.io.IOException;
import java.util.logging.Level;

public class Shape {
    protected String color; //null
    protected boolean filled; // false

    public Shape()  {
        System.out.println("Instance shape");
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }


    void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected boolean isFilled() {
        return filled;
    }
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [" +
                "color='" + color + '\'' +
                ", filled=" + (isFilled() ? "filled" : "not filled") +
                ']';
    }
}
