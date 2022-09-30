package com.codegym.inheritance;

public class Circle extends	GeometricObject{

    public Circle(){

    }

    public Circle(String color, boolean filled){
        super(color, filled);
    }


    public String getColor() {
        System.out.println("Circle ************ getColor");
        return super.getColor();
    }

}
