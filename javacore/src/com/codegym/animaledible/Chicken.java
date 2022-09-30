package com.codegym.animaledible;

public class Chicken extends Animal{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Keu oat oat";
    }
}
