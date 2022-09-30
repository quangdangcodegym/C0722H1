package com.codegym.inheritance;

import java.util.Date;

public  class GeometricObject {
    private String color;
    protected boolean filled;
    public Date dateCreated;


    GeometricObject(){
        System.out.println("GeometricObject contructor");
    }
    public  GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public String getColor() {


        System.out.println("GeometricObject getColor");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
