package com.codegym.equals;

public class Person {
    int age;
    String name;
    String city;
    int id;

    private static String college = "CODEGYM";
    public Person(int id, int age, String name) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return "Codegyme";
        //return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
