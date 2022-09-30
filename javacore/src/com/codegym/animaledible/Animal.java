package com.codegym.animaledible;

public abstract class Animal {
    public Animal(String name){
        this.name = name;
    }
    protected String name;
    public abstract String makeSound();
    public void showMe(){
        System.out.println("My name: " + name);
    }

}
